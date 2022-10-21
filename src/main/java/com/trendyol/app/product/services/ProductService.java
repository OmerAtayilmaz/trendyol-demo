package com.trendyol.app.product.services;

import com.trendyol.app.dto.ProductDto;

import java.util.List;

public interface ProductService {
    void create(ProductDto productDto);
    java.util.List<ProductDto> getAll();
    ProductDto updateProduct(ProductDto uProduct);
    ProductDto getById(Long id);
    java.util.List<ProductDto> getProductByCategoryId(Long id);
    void delete(Long id);
    List<ProductDto> sortProductsByTitle();
}
