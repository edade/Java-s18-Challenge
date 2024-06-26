package com.workintech.demo.service;

import com.workintech.demo.entity.Category;
import com.workintech.demo.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public Category findById(long id) {
        Optional<Category> categoryOptional = categoryRepository.findById(id);
        if (categoryOptional.isPresent()) {
            return categoryOptional.get();
        }

        throw new RuntimeException("Category is not found with given id: " + id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}