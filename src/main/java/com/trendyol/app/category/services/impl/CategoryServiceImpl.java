package com.trendyol.app.category.services.impl;

import com.trendyol.app.category.services.CategoryService;
import com.trendyol.app.dto.CategoryDto;
import com.trendyol.app.entity.Category;
import com.trendyol.app.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public void createCategory(CategoryDto categoryDto) {
        Category categoryModel=new Category();
        categoryModel.setId(categoryDto.getId());
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
            category.setId(item.getId());
            category.setProductList(item.getProductSet());
            categoryArrayList.add(category);
        });
        return categoryArrayList;
    }

    @Override
    public CategoryDto findById(Long id) {
        Category category=categoryRepository.findById(id).orElse(null);
        CategoryDto categoryDto=new CategoryDto();
        if(category==null)return null;

        categoryDto.setId(category.getId());
        categoryDto.setCategoryImage(category.getCategoryImage());
        categoryDto.setCategoryTitle(category.getCategoryTitle());
        categoryDto.setProductList(category.getProductSet());
        return categoryDto;
    }

    @Override
    public void delete(Long id) {
         categoryRepository.deleteById(id);
    }

    @Override
    public List<CategoryDto> getCategoryByName(String categoryName) {
        List<CategoryDto> categoryDtoList=new ArrayList<>();
        categoryRepository.getCategoriesByCategoryTitle(categoryName).forEach(item->{
            CategoryDto c=new CategoryDto();
            c.setCategoryImage(item.getCategoryImage());
            c.setCategoryTitle(item.getCategoryTitle());
            c.setId(item.getId());
            c.setProductList(item.getProductSet());
            categoryDtoList.add(c);
        });
        return categoryDtoList;
    }

    @Override
    public List<CategoryDto> getAllSortedCategories() {
        List<CategoryDto> categoryDtoList=new ArrayList<>();
        categoryRepository.findCategoriesByOrderByIdDesc().forEach(item->{
            CategoryDto c=new CategoryDto();
            c.setCategoryImage(item.getCategoryImage());
            c.setCategoryTitle(item.getCategoryTitle());
            c.setId(item.getId());
            c.setProductList(item.getProductSet());
            categoryDtoList.add(c);
        });
        return categoryDtoList;
    }

    @Override
    public List<CategoryDto> getAllCategoriesByProductSize(int size) {
        List<CategoryDto> categoryDtoList=new ArrayList<>();
        categoryRepository.getCategoryByCustomQuery(size).forEach(item->{
            CategoryDto c=new CategoryDto();
            c.setCategoryImage(item.getCategoryImage());
            c.setCategoryTitle(item.getCategoryTitle());
            c.setId(item.getId());
            c.setProductList(item.getProductSet());
            categoryDtoList.add(c);
        });
        return categoryDtoList;
    }
}
