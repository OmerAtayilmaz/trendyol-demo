package com.trendyol.app.slider.service;

public interface SliderService<T> {

    void create(T t);
    void update(T t);
    void delete(Long id);
    T getById(Long id);
}
