package by.tms.bootstore.dao.rowMapper;

import by.tms.bootstore.entity.books.Genres;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenresRowMapper implements RowMapper<Genres> {
    @Override
    public Genres mapRow(ResultSet rs, int rowNum) throws SQLException {
        Genres genres = new Genres();
        genres.setId(rs.getLong("ID"));
        genres.setName(rs.getString("NAME"));
        return genres;
    }
}
