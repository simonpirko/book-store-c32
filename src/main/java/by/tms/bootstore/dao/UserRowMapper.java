package by.tms.bootstore.dao;

import by.tms.bootstore.entity.user.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    //change
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setId(rs.getLong(0));
        user.setFirstName(rs.getString(1));

        return user;
    }
}
