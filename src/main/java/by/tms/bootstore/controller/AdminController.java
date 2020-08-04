package by.tms.bootstore.controller;


import by.tms.bootstore.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/administrator")
public class AdminController {

    private UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/getAllUsers")
    public String getAllUsers() {
        userService.getUserList();
        return "";
    }

    @GetMapping(path = "/getUser")
    public String getUser(long id){
        userService.getUserById(id);
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

    @GetMapping(path = "/logout")
    public String logoutG() {
        return "";
    }

    @DeleteMapping(path = "/deleteUser")
    public String deleteUser(String email) {
        userService.deleteUserByEmail(email);
        return "";
    }


}
