package com.example.jpademorest.service.Impl;

import com.example.jpademorest.model.Book;
import com.example.jpademorest.repository.BookRepository;
import com.example.jpademorest.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        Optional<Book> book=bookRepository.findById(id);

        return bookRepository.findById(id).orElseThrow(
                ()->new RuntimeException()
        );
    }

    @Override
    public Book updateBook(Book book, int id) {
        Book existingBook = bookRepository.findById(id).orElseThrow(
                ()->new RuntimeException()
        );

        existingBook.setBookName(book.getBookName());
        existingBook.setAuthorName(book.getAuthorName());
        existingBook.setPrice(book.getPrice());
        bookRepository.save(existingBook);

        return existingBook;

    }

    @Override
    public void deleteBook(int id) {
        bookRepository.findById(id).orElseThrow(
                ()->new RuntimeException()
        );

        bookRepository.deleteById(id);
    }
}
