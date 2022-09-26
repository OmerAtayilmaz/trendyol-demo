package com.trendyol.app.product.services.impl;

import com.trendyol.app.dto.ProductDto;
import com.trendyol.app.entity.Product;
import com.trendyol.app.product.services.ProductService;
import com.trendyol.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }

    @Override
    public void create(ProductDto productDto) {
        Product p=new Product();
        p.setCategory_id(productDto.getCategory_id());
        p.setDescription(productDto.getDescription());
        p.setImage(productDto.getImage());
        p.setKeywords(productDto.getKeywords());
        p.setStatus(productDto.isStatus());
        p.setType(productDto.getType());
        p.setProduct_id(productDto.getProduct_id());
        productRepository.save(p);
    }
}
