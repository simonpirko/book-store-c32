package by.tms.bootstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/book")
public class BookController {


    @PostMapping(path = "/addc")
    public String addBook(){

    }
}
