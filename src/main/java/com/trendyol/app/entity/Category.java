package com.trendyol.app.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String categoryTitle;

    @Column
    private String categoryImage;

    //@JsonIgnore
    @OneToMany(mappedBy="category")
    private Set<Product> productSet;

    public Category() {
    }

    public Category(Long id,String categoryTitle,String categoryImage,Set<Product> productSet){
        this.categoryTitle=categoryTitle;
        this.categoryImage=categoryImage;
        this.productSet=productSet;
        this.id=id;
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

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }
}
