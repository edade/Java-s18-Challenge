package com.workintech.demo.service;


import com.workintech.demo.entity.Book;

public interface BookService {
    Book findById(long id);
    Book save(Book book);
}