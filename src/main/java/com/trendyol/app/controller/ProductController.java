package com.trendyol.app.controller;

import com.trendyol.app.dto.ProductDto;
import com.trendyol.app.product.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/")
    public ProductDto create(
            @RequestBody ProductDto productDto) {
        productService.create(productDto);
        return productDto;
    }
}
