package by.tms.bootstore.dao;

import by.tms.bootstore.dao.rowMapper.BookRowMapper;
import by.tms.bootstore.dao.rowMapper.UserRowMapper;
import by.tms.bootstore.entity.user.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

@Repository
public class UserDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private JdbcTemplate template;

    public UserDAO(NamedParameterJdbcTemplate namedParameterJdbcTemplate, JdbcTemplate template) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.template = template;
    }

//    final String INSERT_SQL = "INSERT INTO bookDB (name, author, format, publisher, publicationDate, pages, cost, statusBook, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        KeyHolder keyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(
//                new PreparedStatementCreator() {
//                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
//                        PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[] {"id"});
//                        ps.setString(1, book.getName());
//                        ps.setString(2, book.getAuthor());
//                        ps.setString(3, book.getFormat().toString());
//                        ps.setString(4, book.getPublisher());
//                        ps.setInt(5, book.getPublicationDate());
//                        ps.setInt(6, book.getPages());
//                        ps.setDouble(7, book.getCost());
//                        ps.setString(8, book.getStatusBook().toString());
//                        ps.setString(9, book.getDescription());
//                        return ps;
//                    }
//                },
//                keyHolder);
//        return keyHolder;

    public KeyHolder createUser(User user) {
        final String INSERT_SQL = "INSERT INTO userDB (login, firstName, lastName, birthDate, password, email, telephone,role) VALUES (?,?,?,?,?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        template.update(
                new PreparedStatementCreator() {
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        PreparedStatement ps = connection.prepareStatement(INSERT_SQL, new String[]{"id"});
                        ps.setString(1, user.getLogin());
                        ps.setString(2, user.getFirstName());
                        ps.setString(3, user.getLastName());
                        ps.setString(4, user.getBirthDate().toString());
                        ps.setString(5, user.getPassword());
                        ps.setString(6, user.getEmail());
                        ps.setString(7, user.getTelephone());
                        ps.setString(8, user.getRole().toString());
                        return ps;
                    }
                },
                keyHolder);
        return keyHolder;
    }


    public User auth(String login, String password) {
        return template.queryForObject("select * from userDB where login :=login and password :=password",
                new UserRowMapper());
    }

    public User getUser(long id) {

        User user = template.queryForObject("select * from userDB where ID := id",
                new UserRowMapper());
        return user;
    }

    public List<User> getAllUsers() {
        List<User> userList = template.query("select * from userDB",
                new UserRowMapper());
        return userList;
    }

    public void deleteUserByEmail(String email) {
        template.update("delete from userDB where  email := email");
    }

    public void save() {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("FIRSTNAME", "test")
                .addValue("LASTNAME", "test")
                .addValue("PASSWORD", "test")
                .addValue("EMAIL", "test")
                .addValue("TELEPHONE", "test")
                .addValue("ROLE", "test");
        template.update("insert into USER_DB (FIRSTNAME, LASTNAME, PASSWORD, EMAIL, TELEPHONE, ROLE) values ('er', 'er', 'er', 'er', 'er','er')");
    }

//    public void save(User user) {
//        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
//                .addValue("login", user.getLogin())
//                .addValue("firstName", user.getFirstName())
//                .addValue("lastName", user.getLastName())
//                .addValue("email", user.getEmail());
//        template.update("insert into USER_DB values ( default, LOGIN, FIRSTNAME, LASTNAME, PASSWORD, EMAIL, TELEPHONE, ROLE )", sqlParameterSource) ;
//    }

//    public User user(long id){
//        return template.queryForObject("select * from 'users' where id = :id", User.class);
//    }

//    public List<User> getAll(){
//        return template.query("select * from 'users'", new UserRowMapper());
//    }

//    }
}
