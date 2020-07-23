package by.tms.bootstore.dao;

import by.tms.bootstore.entity.user.User;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Data
@Repository
public class UserDAO {

    private JdbcTemplate template;

//    public void save() {
//        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
//                .addValue("LOGIN", "test")
//                .addValue("FIRSTNAME", "test")
//                .addValue("LASTNAME", "test")
//                .addValue("PASSWORD", "test")
//                .addValue("EMAIL", "test")
//                .addValue("TELEPHONE", "test")
//                .addValue("ROLE", "test");
//        template.update("insert into 'USER_DB' values ( default, :LOGIN, :FIRSTNAME, :LASTNAME, :PASSWORD, :EMAIL, :TELEPHONE, :ROLE )", sqlParameterSource);
////    }

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

    }
}
