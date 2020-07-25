package by.tms.bootstore.dao;

import by.tms.bootstore.entity.books.Book;
import by.tms.bootstore.entity.books.Genres;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import javax.lang.model.util.Types;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BookDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public BookDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
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
                "VALUES (:name1, :author, :format, :publisher, :publicationDate, :pages, :cost, :statusBook, :description)", sqlParameterSource);
    }

//    public int[] batchUpdateUsingJdbcTemplate(Book book) {
//        List<Genres> genres = book.getGenres();
//        return namedParameterJdbcTemplate.batchUpdate("INSERT INTO genresDB VALUES (:idBook, :name)",
//                new BatchPreparedStatementSetter() {
//                    @Override
//                    public void setValues(PreparedStatement ps, int i) throws SQLException {
//                        ps.setLong(1, book.getId());
//                        ps.setString(2, String.valueOf(genres.get(i)));
//                    }
//
//                    @Override
//                    public int getBatchSize() {
//                        return 50;
//                    }
//                });
//    }

}


