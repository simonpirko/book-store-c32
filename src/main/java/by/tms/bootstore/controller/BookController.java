package by.tms.bootstore.controller;


import by.tms.bootstore.entity.books.*;
import by.tms.bootstore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


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
    public String createBookG(Model model) {
        model.addAttribute("format", Format.values());
        model.addAttribute("listPublicationDate", bookService.listYear());
        model.addAttribute("allGenres", bookService.allGenres());
        model.addAttribute("status", StatusBook.values());
        return "book/createBook";
    }

    @PostMapping ("/createBook")
    public String  createBookP (Book book) {
//        Date date= new Date();
//        GregorianCalendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        List<Genres> genres = new ArrayList<>();
//        genres.add(new Genres(1, "Fantasy"));
//        genres.add(new Genres(7, "Thriller"));
//        List<Review> review = new ArrayList<>();
//        review.add(new Review(1, "testR1", Estimation.Neutral, 1, calendar));
//        review.add(new Review(2, "testR2", Estimation.Neutral, 2, calendar));
//        Book book = new Book ("test", "test", Format.Hardback, "test", 2000, 100, genres, review, 234, StatusBook.IN_STOCK, "test");
        bookService.createBook(book);
        return "";
    }

    @GetMapping("/getBook")
    public String getBookG() {
        bookService.getBookById(1L);
                return "";
    }

    @PostMapping ("/getBook")
    public String getBookP() {
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
