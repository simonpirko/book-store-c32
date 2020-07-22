package by.tms.bootstore.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// страница просмотра книги по id

@Controller
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public String form() {
        return "";
    }

    @PostMapping
    public String postForm() {
        return "";
    }

    @GetMapping("/createBook")
    public String createBookG() {
        return "";
    }

    @PostMapping ("/createBook")
    public String  createBookP () {
        return "";
    }

    @GetMapping("/editBook")
    public String editBookG() {
        return "";
    }

    @PostMapping ("/editBook")
    public String editBookP() {
        return "";
    }



}
