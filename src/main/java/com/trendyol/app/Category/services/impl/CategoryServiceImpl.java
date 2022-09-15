package com.trendyol.app.Category.services.impl;

import com.trendyol.app.Category.services.CategoryService;
import com.trendyol.app.dto.CategoryDto;
import com.trendyol.app.dto.UserDto;
import com.trendyol.app.entity.Category;
import com.trendyol.app.entity.User;
import com.trendyol.app.repositories.CategoryRepository;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void createCategory(CategoryDto categoryDto) {
        Category categoryModel=new Category();
        categoryModel.setCategoryImage(categoryDto.getCategoryImage());
        categoryModel.setCategoryTitle(categoryDto.getCategoryTitle());
        categoryRepository.save(categoryModel);
    }

    @Override
    public CategoryDto updateCategory(Long id, CategoryDto categoryDto) {

        return null;
    }

    @Override
    public ArrayList<CategoryDto> listCategories() {
        ArrayList<CategoryDto> categoryArrayList=new ArrayList<>();
        categoryRepository.findAll().forEach(item->{
            CategoryDto category=new CategoryDto();
            category.setCategoryTitle(item.getCategoryTitle());
            category.setCategoryImage(item.getCategoryImage());
            category.setCategory_id(item.getCategory_id());
            category.setParent_id(item.getParent_id());
            categoryArrayList.add(category);
        });
        return categoryArrayList;
    }

    @Override
    public CategoryDto findById(Long id) {
        Category category=categoryRepository.findById(id).orElse(null);
        CategoryDto categoryDto=new CategoryDto();
        if(category==null)return null;

        categoryDto.setCategory_id(category.getCategory_id());
        categoryDto.setCategoryImage(category.getCategoryImage());
        categoryDto.setCategoryTitle(category.getCategoryTitle());
        return categoryDto;
    }

    @Override
    public CategoryDto delete(Long id) {
        return null;
    }
}
