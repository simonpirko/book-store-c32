package by.tms.bootstore.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String login;

    public User(String login, String firstName, String lastName, Calendar birthDate, String password, String email, String telephone) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
    }

    private String firstName;
    private String lastName;
    private Calendar birthDate;
    private String password;
    private String email;
    private List <WishList> wishList;
    private String telephone;
    private Role role;

}
