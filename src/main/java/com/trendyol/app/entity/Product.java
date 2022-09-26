package com.trendyol.app.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long product_id;

    @Column(length = 120, nullable = true, unique = false)
    private String title;

    @Column(length = 120, nullable = true, unique = false)
    private String keywords;

    @Column(nullable = true, unique = false)
    private String description;

    @Column(length = 150, nullable = false, unique = true)
    private String image;

    @Column(length = 35, nullable = false, unique = false)
    private String type; // used-new-newlike

    @Column(nullable = false, unique = false)
    private boolean status;

    // Relations
    // product-category, product-user, product-comment, product-images

    public Product() {
    }

    public Product(Long product_id, String title, String keywords, String description,
            String image, String type, boolean status, User user) {
        this.product_id = product_id;
        this.title = title;
        this.keywords = keywords;
        this.description = description;
        this.image = image;
        this.type = type;
        this.status = status;
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

}
