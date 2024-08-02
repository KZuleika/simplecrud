package com.kzcp.simplecrud.controller;

import com.kzcp.simplecrud.entity.Book;
import com.kzcp.simplecrud.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibraryController {
    private final LibraryService libraryService;

    @Autowired
    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping(path = "getBooks")
    public List<Book> getBooks(){
        return this.libraryService.getBooks();
    }

    @GetMapping(path = "getBook/{bookId}")
    public Optional<Book> getBookById(@PathVariable("bookId") Long id){
        return this.libraryService.getBookById(id);
    }

    @PostMapping(path = "createBook")
    public Book createBook(@RequestBody Book book){
        return this.libraryService.createBook(book);
    }

    @PostMapping(path = "editBook")
    public String editBook(@RequestBody Book book){
        return this.libraryService.editBook(book);
    }

    @DeleteMapping("{bookId}")
    public String deleteBook(@PathVariable("bookId") Long id){
         return this.libraryService.deleteBook(id);
    }
}
