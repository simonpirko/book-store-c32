package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// просмотр книги

@Controller
@RequestMapping(path = "/")
public class HomepageController {

    @GetMapping
    public String form(){
        return "index";
    }


}
