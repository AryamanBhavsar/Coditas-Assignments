package com.example.jpademorest.controller;

import com.example.jpademorest.model.Book;
import com.example.jpademorest.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        return new ResponseEntity<>(bookService.getBookById(id),HttpStatus.OK);
    }


    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable int id){

        return new ResponseEntity<>(bookService.updateBook(book,id),HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBookById(@PathVariable int id){
        bookService.deleteBook(id);
        return new ResponseEntity<>("Deleted Sucessfully!",HttpStatus.OK);
    }

}
