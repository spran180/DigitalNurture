package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServices {
    BookRepository repository;

    public void setBook(String name){
        System.out.println(name + " is set");
        this.repository.books.add(name);
    }

    public String getBook(String name){

        return this.repository.findBook(name);
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.repository = bookRepository;
    }
}
