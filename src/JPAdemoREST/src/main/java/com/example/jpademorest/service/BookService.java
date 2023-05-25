package com.example.jpademorest.service;

import com.example.jpademorest.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(int id);
    Book updateBook(Book book,int id);
    void deleteBook(int id);
}
