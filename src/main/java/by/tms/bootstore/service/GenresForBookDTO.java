package by.tms.bootstore.service;

import by.tms.bootstore.entity.books.Genres;

public class GenresForBookDTO {

    private long idBook;
    private Genres genres;

    public GenresForBookDTO(long idBook, Genres genres) {
        this.idBook = idBook;
        this.genres = genres;
    }

    public GenresForBookDTO() {
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public Genres getGenres() {
        return genres;
    }

    public void setGenres(Genres genres) {
        this.genres = genres;
    }
}
