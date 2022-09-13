package com.trendyol.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="products")

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long product_id;

    @Column(length=120,nullable = true, unique=false)
    private String title;

    @Column(length=120,nullable=true,unique=false)
    private String keywords;

    @Column(nullable = true,unique = false)
    private String description;

    @Column(length=150,nullable = false,unique=true)
    private String image;

    @Column(length=35,nullable=false, unique=false)
    private String type; //used-new-newlike

    @Column(nullable=false,unique=false)
    private boolean status;

    //Relations
    //product-category, product-user, product-comment, product-images

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private User user;


    @ManyToOne
    private Category category;






}
