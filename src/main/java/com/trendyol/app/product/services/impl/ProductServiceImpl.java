package com.trendyol.app.product.services.impl;

import com.trendyol.app.dto.ProductDto;
import com.trendyol.app.entity.Category;
import com.trendyol.app.entity.Product;
import com.trendyol.app.product.services.ProductService;
import com.trendyol.app.repositories.CategoryRepository;
import com.trendyol.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void create(ProductDto productDto) {
        Product p = new Product();
        System.out.println(productDto.getCategory_id());
        Category c=categoryRepository.findById(productDto.getCategory_id()).orElse(null);
        p.setCategory(c);
        p.setId(productDto.getId());
        p.setTitle(productDto.getTitle());
        productRepository.save(p);
    }
}
