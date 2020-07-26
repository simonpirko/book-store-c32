package by.tms.bootstore.controller;


import by.tms.bootstore.entity.books.*;
import by.tms.bootstore.entity.user.Role;
import by.tms.bootstore.entity.user.User;
import by.tms.bootstore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

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
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.getTime();

        List<Genres> genres = new ArrayList<>();
        genres.add(Genres.Adventure);
        genres.add(Genres.Romance);
        List<Review> review = new ArrayList<>();
        review.add(new Review(1, "testR1", Estimation.Neutral, 1, calendar));
        review.add(new Review(2, "testR2", Estimation.Neutral, 2, calendar));
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
