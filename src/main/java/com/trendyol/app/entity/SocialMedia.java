package com.trendyol.app.entity;


import javax.persistence.*;

@Entity
@Table(name="social_media")


public class SocialMedia {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long social_media_id;



}
