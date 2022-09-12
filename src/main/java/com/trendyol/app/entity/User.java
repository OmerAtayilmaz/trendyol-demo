package com.trendyol.app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="users")
public class User {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long user_id;



}
