package by.tms.bootstore.dao;

import by.tms.bootstore.entity.user.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {

    private JdbcTemplate template;

    public void save(User user) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("login", user.getLogin())
                .addValue("firstName", user.getFirstName())
                .addValue("lastName", user.getLastName())
                .addValue("email", user.getEmail());
        template.update("insert into 'users' values ( default, :login,,? )", sqlParameterSource) ;
    }

//    public User user(long id){
//        return template.queryForObject("select * from 'users' where id = :id", User.class);
//    }

    public List<User> getAll(){
        return template.query("select * from 'users'", new UserRowMapper());
    }

}
