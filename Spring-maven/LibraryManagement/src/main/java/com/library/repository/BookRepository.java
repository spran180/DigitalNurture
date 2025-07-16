package com.library.repository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookRepository {
    public List<String> books;

    public String findBook(String name){
        System.out.println("Book Found");
        return "Harry Potter: Prisoners of Azkaban";
    }
}
