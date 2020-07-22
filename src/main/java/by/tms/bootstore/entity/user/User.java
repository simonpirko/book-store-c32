package by.tms.bootstore.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;
    private String Login;
    private String firstName;
    private String lastName;
    private Calendar birthDate;
    private String password;
    private String email;
    private List <WishList> wishList;
    private String telephone;
    private Role role;

}
