package by.tms.bootstore.dao.rowMapper;

import by.tms.bootstore.entity.books.Book;
import by.tms.bootstore.entity.books.Format;
import by.tms.bootstore.entity.books.StatusBook;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setId(rs.getLong("ID"));
        book.setName(rs.getString("NAME"));
        book.setAuthor(rs.getString("AUTHOR"));
        book.setFormat(Format.valueOf(rs.getString("FORMAT")));
        book.setPublisher(rs.getString("PUBLISHER"));
        book.setPublicationDate(rs.getInt("PUBLICATIONDATE"));
        book.setPages(rs.getInt("PAGES"));
        book.setCost(rs.getDouble("COST"));
        book.setStatusBook(StatusBook.valueOf(rs.getString("STATUSBOOK")));
        book.setDescription(rs.getString("DESCRIPTION"));
        return book;
    }
}


