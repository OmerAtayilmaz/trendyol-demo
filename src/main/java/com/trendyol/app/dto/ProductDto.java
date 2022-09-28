package com.trendyol.app.dto;

import com.trendyol.app.entity.Category;

public class ProductDto {

    private Long product_id;

    private String title;

    private boolean status;

    private Long category_id;

    public ProductDto(Long product_id, String title,
            boolean status, Long category_id) {
        this.product_id = product_id;
        this.title = title;
        this.status = status;
        this.category_id = category_id;
    }

    public ProductDto() {

    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

}
