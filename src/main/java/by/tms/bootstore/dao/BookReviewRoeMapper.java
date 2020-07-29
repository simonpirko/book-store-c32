package by.tms.bootstore.dao;

import by.tms.bootstore.service.DTO.BookReviewDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookReviewRoeMapper implements RowMapper<BookReviewDTO> {
    @Override
    public BookReviewDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        BookReviewDTO bookReviewDTO = new BookReviewDTO();
        bookReviewDTO.setIdBook(rs.getLong("IDBOOK"));
        bookReviewDTO.setIdReview(rs.getLong("IDREVIEW"));
        return bookReviewDTO;
    }
}
