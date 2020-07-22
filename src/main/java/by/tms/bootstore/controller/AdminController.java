package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/administrator")
public class AdminController {

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

    @GetMapping(path = "/logout")
    public String logoutG() {
        return "";
    }

    @DeleteMapping(path = "/delete")
    public String deleteD() {
        return "";
    }




}
