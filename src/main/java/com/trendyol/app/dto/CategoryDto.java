package com.trendyol.app.dto;

import com.trendyol.app.entity.Product;

import java.util.Set;

public class CategoryDto {

    private Long id;

    private String categoryTitle;

    private String categoryImage;


    private Set<Product> productList;

    public CategoryDto(Long id, String categoryTitle, String categoryImage
           ) {
        this.id = id;
        this.categoryTitle = categoryTitle;
        this.categoryImage = categoryImage;
    }

    public CategoryDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }


    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }
}
