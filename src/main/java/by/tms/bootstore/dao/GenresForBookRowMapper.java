package by.tms.bootstore.dao;

import by.tms.bootstore.entity.books.Genres;
import by.tms.bootstore.service.DTO.GenresForBookDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenresForBookRowMapper implements RowMapper<GenresForBookDTO> {
    @Override
    public GenresForBookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        GenresForBookDTO genres = new GenresForBookDTO();
        genres.setIdBook(rs.getLong("IDBOOK"));
        genres.setIdBook(rs.getLong("IDGENRES"));
        return genres;
    }
}
