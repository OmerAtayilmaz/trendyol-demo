package com.trendyol.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "products")
public class Product implements Serializable {

    @Id
    private Long id;

    @Column(length = 120, nullable = true, unique = false)
    private String title;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="category_id",referencedColumnName="id")
    private Category category;


    public Product() {
    }

    public Product(Long id,String title,Category category){
        this.category=category;
        this.title=title;
        this.id=id;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
