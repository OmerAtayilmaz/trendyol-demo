package com.trendyol.app.entity;

import javax.persistence.*;

@Entity
@Table(name="setting")


public class Setting {

    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long setting_id;
}
