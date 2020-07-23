package by.tms.bootstore.controller;


import by.tms.bootstore.dao.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @GetMapping(path = "/reg")
    public String regG() {
//        UserDAO userDAO = new UserDAO();
//        userDAO.save();

        return "";
    }

    @PostMapping(path = "/reg")
    public String regP() {
        return "";
    }

    @GetMapping(path = "/auth")
    public String authG() {
        return "";
    }

    @PostMapping (path = "/auth")
    public String  authP () {
        return "";
    }

    @GetMapping(path = "/profile")
    public String  profileG () {
        return "";
    }

    @PostMapping(path = "/profile")
    public String  profileP () {
        return "";
    }


    @GetMapping(path = "/edit")
    public String editBookG() {
        return "";
    }

    @PostMapping (path = "/edit")
    public String editBookP() {
        return "";
    }

    @GetMapping(path = "/wishList")
    public String wishListG() {
        return "";
    }

    @PostMapping (path = "/wishList")
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