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
        return "book";
    }

    @PostMapping
    public String postForm(@RequestParam Long id) {
        return "";
    }
}
