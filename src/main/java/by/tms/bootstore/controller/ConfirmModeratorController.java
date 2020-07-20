package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/confirmOrder")
public class ConfirmModeratorController {


    @GetMapping
    public String form(){
        return "accountOption/actions/confirmOrder";
    }
}
