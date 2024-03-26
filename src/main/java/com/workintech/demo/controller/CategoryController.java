package com.workintech.demo.controller;

import com.workintech.demo.dto.CategoryResponse;
import com.workintech.demo.entity.Category;
import com.workintech.demo.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {
    private CategoryService categoryService;

    @PostMapping
    public CategoryResponse save(@RequestBody Category category) {
        Category savedCategory = categoryService.save(category);
        return new CategoryResponse(savedCategory.getId(), savedCategory.getName());
    }

    @GetMapping("/{id}")
    public CategoryResponse get(@PathVariable long id) {
        Category category = categoryService.findById(id);
        return new CategoryResponse(category.getId(), category.getName());
    }
}