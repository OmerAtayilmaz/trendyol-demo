package com.trendyol.app.entity;


import javax.persistence.*;

@Entity
@Table(name="categories")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long category_id;

}
