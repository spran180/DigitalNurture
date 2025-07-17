package com.library.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class BookRepository {
    public List<String> books;

    public String findBook(String name){
        System.out.println("Book Found");
        return "Harry Potter: Prisoners of Azkaban";
    }
}
