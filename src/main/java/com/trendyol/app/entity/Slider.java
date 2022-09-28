package com.trendyol.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="slider")
public class Slider {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = true,name = "title",columnDefinition = "mydefault")
    private String title;

    @Column(nullable = true,name = "image_url")
    private String img;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName="id")
    public User user;

    public Slider() {
    }
    public Slider(Long id,String title,String img){
        this.id=id;
        this.title=title;
        this.img=img;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
