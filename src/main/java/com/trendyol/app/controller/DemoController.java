package com.trendyol.app.controller;

import com.trendyol.app.entity.Book;
import com.trendyol.app.entity.Page;
import com.trendyol.app.repositories.BookRepository;
import com.trendyol.app.repositories.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    PageRepository pageRepository;

    @GetMapping(value = "/hi")
    public String create() {
        bookRepository.save(new Book("A1", "B", "C1"));
        bookRepository.save(new Book("A2", "B", "C2"));
        bookRepository.save(new Book("A2", "B", "C3"));
        bookRepository.save(new Book("A3", "B", "C4"));
        bookRepository.save(new Book("A4", "B", "C5"));
        bookRepository.save(new Book("A5", "B", "C6"));

        return "YUP";

    }

    @GetMapping(value = "/page")
    public String createPage() {
        Book book = bookRepository.findById(1L).orElse(null);
        pageRepository.save(new Page(2, "CONTENT", "CHAPTER", book));

        return "PUYYY";
    }

    @GetMapping(value = "/aaa")
    public List<Book> pageList() {
        List<Book> myList = new ArrayList<>();
        bookRepository.findAll().forEach(item -> {
            Book b = new Book();
            b.setAuthor(item.getAuthor());
            b.setId(item.getId());
            b.setIsbn(item.getIsbn());
            b.setPages(item.getPages());
            b.setTitle(item.getTitle());
            myList.add(b);
        });
        return myList;
    }

}
