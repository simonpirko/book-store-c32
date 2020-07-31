package by.tms.bootstore.service.DTO;

import by.tms.bootstore.entity.books.Genres;

public class GenresForBookDTO {

    private long idBook;
    private long idGenres;

    public GenresForBookDTO(long idBook, long idGenres) {
        this.idBook = idBook;
        this.idGenres = idGenres;
    }

    public GenresForBookDTO() {
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public long getIdGenres() {
        return idGenres;
    }

    public void setIdGenres(long idGenres) {
        this.idGenres = idGenres;
    }
}
