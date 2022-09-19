package com.trendyol.app.category.services;

import com.trendyol.app.dto.CategoryDto;

import java.util.ArrayList;

public interface CategoryService {

    void createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(Long id, CategoryDto categoryDto);
    ArrayList<CategoryDto> listCategories();
    CategoryDto findById(Long id);
    CategoryDto delete(Long id);

}
