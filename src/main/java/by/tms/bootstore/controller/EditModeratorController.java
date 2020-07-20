package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/editModerator")
public class EditModeratorController {

    @GetMapping
    public String form(){
        return "accountOption/editing/editModeratorProfile";
    }

}
