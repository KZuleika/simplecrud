package com.kzcp.simplecrud.service;

import com.kzcp.simplecrud.entity.Book;
import com.kzcp.simplecrud.repository.LibraryRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService{
    @Autowired
    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public List<Book> getBooks(){
        return this.libraryRepository.findAll();
    }

    public Optional<Book> getBookById(Long id){
        return this.libraryRepository.findById(id);
    }

    public Book createBook(Book book){
        this.libraryRepository.save(book);
        return book;
    }
    public String editBook(Book book){
        if (this.getBookById(book.getId()).isPresent()) {
            this.libraryRepository.save(book);
            return "Se han guardado los cambios";
        }
        else{
            return "El ID no es válido";
        }
    }
    public String deleteBook(Long id){
        if (this.getBookById(id).isPresent()) {
            this.libraryRepository.deleteById(id);
            return "Se han guardado los cambios";
        }
        else{
            return "El ID no es válido";
        }

    }
}

