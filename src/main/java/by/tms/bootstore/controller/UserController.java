package by.tms.bootstore.controller;


import by.tms.bootstore.dao.UserDAO;
import by.tms.bootstore.entity.user.Role;
import by.tms.bootstore.entity.user.User;
import by.tms.bootstore.entity.user.WishList;
import by.tms.bootstore.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.Calendar;
import java.util.List;


@Controller
@RequestMapping(path = "/user")
public class UserController {

    private UserService userService;

//    private long id;
//    private String login;
//    private String firstName;
//    private String lastName;
//    private Calendar birthDate;
//    private String password;
//    private String email;
//    private List <WishList> wishList;
//    private String telephone;
//    private Role role;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(path = "/reg")
    public String reg(@RequestParam String login,
                      @RequestParam String firstName,
                      @RequestParam String lastName,
                      @RequestParam String birthDate,
                      @RequestParam String password,
                      @RequestParam String email,
                      @RequestParam String telephone) {

        User user = new User(login, firstName, lastName, birthDate, password, email, telephone, Role.USER);
        userService.createUser(user);
        return "";
    }

//    @PostMapping(path = "/reg")
//    public String reg(@RequestParam String login,
//                      @RequestParam String firstName,
//                      @RequestParam String lastName,
//                      @RequestParam Calendar birthDate,
//                      @RequestParam String password,
//                      @RequestParam String email,
//                      @RequestParam String telephone) {
//        User user = new User(login, firstName, lastName, birthDate, password, email, telephone);
//        userService.createUser(user);
//        return "";
//    }

    @GetMapping(path = "/auth")
    public String authG() {
        return "";
    }

    @PostMapping(path = "/auth")
    public String authP() {
        return "";
    }

    @GetMapping(path = "/profile")
    public String profileG() {
        return "";
    }

    @PostMapping(path = "/profile")
    public String profileP() {
        return "";
    }


    @GetMapping(path = "/edit")
    public String editBookG() {
        return "";
    }

    @PostMapping(path = "/edit")
    public String editBookP() {
        return "";
    }

    @GetMapping(path = "/wishList")
    public String wishListG() {
        return "";
    }

    @PostMapping(path = "/wishList")
    public String wishListP() {
        return "";
    }


    @GetMapping(path = "/logout")
    public String logoutG() {
        return "";
    }

    @DeleteMapping(path = "/delete")
    public String deleteD() {
        return "";
    }


}