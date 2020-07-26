package by.tms.bootstore.dao;

import by.tms.bootstore.entity.books.Book;
import by.tms.bootstore.entity.books.Genres;
import by.tms.bootstore.entity.books.Review;
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

    private void addGenres(long idBook, Genres genres) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("idBook", idBook)
                .addValue("name", genres.toString());
                     namedParameterJdbcTemplate.update("INSERT INTO genresDB (idBook, name) VALUES (:idBook, :name)", sqlParameterSource);
    }

    public void saveGenres (Book book){
        for (Genres genres: book.getGenres()) {
            addGenres(book.getId(), genres);
        }
    }


    public int[] saveReview (Book book) {
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

    private void addBookReviewDB(long idBook, long idReview) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("idBook", idBook)
                .addValue("idReview", idReview);
        namedParameterJdbcTemplate.update("INSERT INTO bookReviewDB (idBook, idReview) VALUES (:idBook, :idReview)", sqlParameterSource);
    }

    public void saveBookReviewDB(Book book){
        List<Review> review = book.getReview();
        for (Review rev : review) {
            addBookReviewDB(book.getId(), rev.getId());
        }
    }








}


