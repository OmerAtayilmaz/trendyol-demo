package com.trendyol.app.dto;

import com.trendyol.app.entity.Product;

import java.util.Set;

public class CategoryDto {

    private Long category_id;

    private String categoryTitle;

    private String categoryImage;

    private Integer parent_id;

    private Set<Product> productList;

    public CategoryDto(Long category_id, String categoryTitle, String categoryImage,
            Integer parent_id) {
        this.category_id = category_id;
        this.categoryTitle = categoryTitle;
        this.categoryImage = categoryImage;
        this.parent_id = parent_id;
    }

    public CategoryDto() {
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
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

    public Integer getParent_id() {
        return parent_id;
    }

    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    public Set<Product> getProductList() {
        return productList;
    }

    public void setProductList(Set<Product> productList) {
        this.productList = productList;
    }
}
