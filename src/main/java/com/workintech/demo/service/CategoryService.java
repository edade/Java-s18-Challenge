package com.workintech.demo.service;


import com.workintech.demo.entity.Category;

public interface CategoryService {
    Category findById(long id);

    Category save(Category category);


}