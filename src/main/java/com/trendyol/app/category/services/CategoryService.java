package com.trendyol.app.category.services;

import com.trendyol.app.dto.CategoryDto;
import com.trendyol.app.entity.Category;

import java.util.ArrayList;
import java.util.List;

public interface CategoryService {

    void createCategory(CategoryDto categoryDto);
    CategoryDto updateCategory(Long id, CategoryDto categoryDto);
    ArrayList<CategoryDto> listCategories();
    CategoryDto findById(Long id);
    void delete(Long id);
    List<CategoryDto> getCategoryByName(String categoryName);
    List<CategoryDto> getAllSortedCategories();
    List<CategoryDto> getAllCategoriesByProductSize(int productSize);
}
