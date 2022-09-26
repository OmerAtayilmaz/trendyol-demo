package com.trendyol.app.controller;

import com.trendyol.app.dto.ProductDto;
import com.trendyol.app.product.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ProductDto create(
            @RequestBody ProductDto productDto) {
        productService.create(productDto);
        return productDto;
    }

    @GetMapping
    public List<ProductDto> getAllProducts() {
        List<ProductDto> productList = new java.util.ArrayList<ProductDto>();
        productList.add(new ProductDto(1L, "mytitle", true, null));
        return productList;
    }
}
