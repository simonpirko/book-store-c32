package by.tms.bootstore.service;

import by.tms.bootstore.dao.BookDAO;
import by.tms.bootstore.entity.books.Book;
import by.tms.bootstore.entity.books.Genres;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {


    private final BookDAO bookDAO;
    private final ModelMapper modelMapper;


    public BookService(BookDAO bookDAO, ModelMapper modelMapper) {
        this.bookDAO = bookDAO;
        this.modelMapper = modelMapper;
    }

    public void createBook(Book book) {
        bookDAO.saveBook(book);
        bookDAO.saveGenres(book);
        bookDAO.saveReview(book);
        bookDAO.saveBookReviewDB(book);
    }

    public void updateBook(Book book) {
    }

    public Book getBookById(Long id) {
        return new Book();
    }

    public List<Book> getAllBooksByName(String name) {
        return new ArrayList<Book>();
    }

    public List<Book> getAllBooksByAuthor(String author) {
        return new ArrayList<Book>();
    }

    public List<Book> getAllBooksByFormat(String format) {
        return new ArrayList<Book>();
    }

    public List<Book> getAllBooksByPublisher(String publisher) {
        return new ArrayList<Book>();
    }

    // для фильтрации в дальнейшем, чтобы выборка была из одного ИЛИ НЕСКОЛЬКИХ жанров
    public List<Book> getAllBooksByGenres(List<Genres> genresList) {
        return new ArrayList<Book>();
    }

    public List<Book> getAllOnlyPositiveReviews() {
        return new ArrayList<Book>();
    }

    public List<Book> getAllOnlyNegativeReviews() {
        return new ArrayList<Book>();
    }

    public List<Book> getAllBookByCostRange(double min, double max) {
        return new ArrayList<Book>();
    }

    public List<Book> getAllInStock() {
        return new ArrayList<Book>();
    }

    //type - возрастание или убывание
    public List<Book> sortByName(String type) {
        return new ArrayList<Book>();
    }

    //type - возрастание или убывание
    public List<Book> sortByAuthor(String type) {
        return new ArrayList<Book>();
    }

    //type - возрастание или убывание
    public List<Book> sortByPublicationDate(String type) {
        return new ArrayList<Book>();
    }

    //type - возрастание или убывание
    public List<Book> sortByCost(String type) {
        return new ArrayList<Book>();
    }

    // сортировка по рекомендую/нерекомендую
    public List<Book> sortByReviews(String typeOfReview) {
        return new ArrayList<Book>();
    }

}

