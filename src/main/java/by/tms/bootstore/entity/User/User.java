package by.tms.bootstore.entity.User;

import java.util.Calendar;
import java.util.List;

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
