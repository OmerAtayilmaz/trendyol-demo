package com.trendyol.app.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long category_id;

    @Column(nullable = false, unique = true)
    private String categoryTitle;

    @Column
    private String categoryImage;

    @Column(columnDefinition = "integer default 0")
    private Integer parent_id;

    public Category(Long category_id, String categoryImage, String categoryTitle,
            Integer parent_id) {
        this.category_id = category_id;
        this.parent_id = parent_id;
        this.categoryImage = categoryImage;
        this.categoryTitle = categoryTitle;
    }

    public Category() {

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

}
