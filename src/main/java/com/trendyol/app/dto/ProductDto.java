package com.trendyol.app.dto;

import com.trendyol.app.entity.Category;

public class ProductDto {

    private Long product_id;

    private String title;

    private String keywords;

    private String description;

    private String image;

    private String type; // used-new-newlike

    private boolean status;

    private Category category_id;

    public ProductDto(Long product_id, String title, String keywords, String description, String image, String type,
            boolean status, Category category_id) {
        this.product_id = product_id;
        this.title = title;
        this.keywords = keywords;
        this.description = description;
        this.image = image;
        this.type = type;
        this.status = status;

        this.category_id = category_id;
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

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public ProductDto() {

    }

}
