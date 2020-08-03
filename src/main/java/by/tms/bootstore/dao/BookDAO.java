package by.tms.bootstore.dao;

import by.tms.bootstore.dao.rowMapper.BookRowMapper;
import by.tms.bootstore.dao.rowMapper.GenresForBookRowMapper;
import by.tms.bootstore.dao.rowMapper.GenresRowMapper;
import by.tms.bootstore.entity.books.Book;
import by.tms.bootstore.entity.books.Genres;
import by.tms.bootstore.entity.books.Review;
import by.tms.bootstore.service.DTO.BookReviewDTO;
import by.tms.bootstore.service.DTO.GenresForBookDTO;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;


@Repository
public class BookDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private JdbcTemplate jdbcTemplate;

    public BookDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate, JdbcTemplate jdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.jdbcTemplate = jdbcTemplate;
    }


    public KeyHolder saveBook(Book book) {
        final String INSERT_SQL = "INSERT INTO bookDB (name, author, format, publisher, publicationDate, pages, cost, statusBook, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] {"id"});
                        ps.setString(1, book.getName());
                        ps.setString(2, book.getAuthor());
                        ps.setString(3, book.getFormat().toString());
                        ps.setString(4, book.getPublisher());
                        ps.setInt(5, book.getPublicationDate());
                        ps.setInt(6, book.getPages());
                        ps.setDouble(7, book.getCost());
                        ps.setString(8, book.getStatusBook().toString());
                        ps.setString(9, book.getDescription());
                        return ps;
                    }
                },
                keyHolder);
        return keyHolder;
    }



    public int[] saveGenres (List<GenresForBookDTO> genresForBookDTOList) {
        return jdbcTemplate.batchUpdate("INSERT INTO bookGenresDB (idBook, idGenres) VALUES (?, ?)",
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setLong(1, genresForBookDTOList.get(i).getIdBook());
                        ps.setLong(2, genresForBookDTOList.get(i).getIdGenres());
                    }
                    @Override
                    public int getBatchSize() {
                        return genresForBookDTOList.size();
                    }
                });
    }


    public int[] saveReview(Book book) {
        List<Review> review = book.getReview();
        return jdbcTemplate.batchUpdate("INSERT INTO reviewDB (body, estimation, idUser, publicationDate) VALUES (?, ?, ?, ?)",
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setString(1, review.get(i).getBody());
                        ps.setString(2, review.get(i).getEstimation().toString());
                        ps.setLong(3, review.get(i).getIdUser());
                        ps.setString(4, review.get(i).getDate().toString());
                    }

                    @Override
                    public int getBatchSize() {
                        return review.size();
                    }
                });
    }

    public int[] saveBookReviewDB(List<BookReviewDTO> bookReviewDTOList) {
        return jdbcTemplate.batchUpdate("INSERT INTO bookReviewDB (idBook, idReview) VALUES (?, ?)",
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setLong(1, bookReviewDTOList.get(i).getIdBook());
                        ps.setLong(2, bookReviewDTOList.get(i).getIdReview());
                    }

                    @Override
                    public int getBatchSize() {
                        return bookReviewDTOList.size();
                    }
                });
    }

    public Book getBook (long id){
        Book book = jdbcTemplate.queryForObject(
                "SELECT * FROM bookDB WHERE ID = ?",
                new Object[] { id }, new BookRowMapper());
        return book;
    }

    public List <GenresForBookDTO> getGenresDTO (long id){
        List <GenresForBookDTO> genresForBookDTOList =  jdbcTemplate.query(
                "SELECT * FROM genresDB WHERE IDBOOK = ?",
                new Object[] { id }, new GenresForBookRowMapper());
        return genresForBookDTOList;
    }

    public List <Genres> getAllGenres (){
        List <Genres> genresList =  jdbcTemplate.query(
                "SELECT * FROM genresDB",
                new GenresRowMapper());
        return genresList;
    }



}


