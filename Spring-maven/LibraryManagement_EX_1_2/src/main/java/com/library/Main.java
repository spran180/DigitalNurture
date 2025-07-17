package com.library;
import com.library.service.BookServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Application Loaded");
        BookServices service = (BookServices) context.getBean("bookServices");

        System.out.println(service.getBook("Harry Potter"));

        System.out.println("Application finished");
    }
}
