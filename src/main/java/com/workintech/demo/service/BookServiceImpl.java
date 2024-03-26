package com.workintech.demo.service;


import com.workintech.demo.entity.Book;
import com.workintech.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book findById(long id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if (bookOptional.isPresent()) {
            return bookOptional.get();
        }
        throw new RuntimeException("Book is not found with given id!");
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}