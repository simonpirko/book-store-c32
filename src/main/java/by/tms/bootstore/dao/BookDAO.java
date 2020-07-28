package by.tms.bootstore.dao;

import by.tms.bootstore.entity.books.Book;
import by.tms.bootstore.entity.books.Review;
import by.tms.bootstore.service.BookReviewDTO;
import by.tms.bootstore.service.GenresForBookDTO;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;


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

    public void saveBook(Book book) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("name", book.getName())
                .addValue("author", book.getAuthor())
                .addValue("format", book.getFormat().toString())
                .addValue("publisher", book.getPublisher())
                .addValue("publicationDate", book.getPublicationDate())
                .addValue("pages", book.getPages())
                .addValue("cost", book.getCost())
                .addValue("statusBook", book.getStatusBook().toString())
                .addValue("description", book.getDescription());
        namedParameterJdbcTemplate.update("INSERT INTO bookDB (name, author, format, publisher, publicationDate, pages, cost, statusBook, description) " +
                "VALUES (:name, :author, :format, :publisher, :publicationDate, :pages, :cost, :statusBook, :description)", sqlParameterSource);
    }


    public int[] saveGenres(List<GenresForBookDTO> genresForBookDTOList) {
        return jdbcTemplate.batchUpdate("INSERT INTO genresDB (idBook, name) VALUES (?, ?)",
                new BatchPreparedStatementSetter() {

                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setLong(1, genresForBookDTOList.get(i).getIdBook());
                        ps.setString(2, genresForBookDTOList.get(i).getGenres().toString());
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
}


