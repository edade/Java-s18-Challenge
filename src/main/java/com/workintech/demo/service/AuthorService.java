package com.workintech.demo.service;


import com.workintech.demo.entity.Author;

public interface AuthorService {
    Author findById(long id);

    Author save(Author author);
}