package com.trendyol.app.dto;

import com.trendyol.app.entity.Category;

public class ProductDto {

    private Long id;

    private String title;


    private Long category_id;

    public ProductDto(Long product_id, String title, Long category_id) {
        this.id = product_id;
        this.title = title;
        this.category_id = category_id;
    }

    public ProductDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

}
