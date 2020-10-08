package com.responsywnie.springmysql.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> listAll(){//metoda zwraca liste ksiązek
        return bookRepo.findAll();
    }
    public void saveBook (Book book){
        bookRepo.save(book);
    }
    public Book get(Long id){
        return bookRepo.findById(id).get();
    }
    public void deleteBook (Long id){
        bookRepo.deleteById(id);
    }
}
