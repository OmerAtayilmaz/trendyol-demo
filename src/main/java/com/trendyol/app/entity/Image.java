package com.trendyol.app.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name ="image")

public class Image {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


}
