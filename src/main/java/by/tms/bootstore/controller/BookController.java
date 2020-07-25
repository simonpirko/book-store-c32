package by.tms.bootstore.controller;


import by.tms.bootstore.entity.books.*;
import by.tms.bootstore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

// страница просмотра книги по id

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String bookPagesG() {
        return "";
    }

    @PostMapping
    public String bookPagesP() {
        return "";
    }

    @GetMapping("/createBook")
    public String createBookG() {
        return "";
    }

    @PostMapping ("/createBook")
    public String  createBookP () {
        List<Genres> genres = new ArrayList<>();
        genres.add(Genres.Adventure);
        genres.add(Genres.Romance);
        List<Review> review = new ArrayList<>();
        Book book = new Book (1,"test", "test", Format.Hardback, "test", 2000, 100, genres, review, 234, StatusBook.IN_STOCK, "test");

        bookService.createBook(book);
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
