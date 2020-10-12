package com.responsywnie.springmysql.controller;

import com.responsywnie.springmysql.model.Book;
import com.responsywnie.springmysql.model.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/")
    private String viewHomePage(Model model){//implementujemy LISTĘ
        List<Book>listBook=bookService.listAll();
        model.addAttribute("listBook",listBook);
        return "index";
    }
}
