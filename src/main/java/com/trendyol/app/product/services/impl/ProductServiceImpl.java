package com.trendyol.app.product.services.impl;

import com.trendyol.app.dto.ProductDto;
import com.trendyol.app.entity.Category;
import com.trendyol.app.entity.Product;
import com.trendyol.app.product.services.ProductService;
import com.trendyol.app.repositories.CategoryRepository;
import com.trendyol.app.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public List<ProductDto> getAll() {
         List<ProductDto> productDtoList=new java.util.ArrayList();
         productRepository.findAll().forEach(item->{
             ProductDto p=new ProductDto();
             p.setCategory_id(item.getCategory().getId());
             p.setId(item.getId());
             p.setTitle(item.getTitle());
             productDtoList.add(p);
         });
         return productDtoList;
    }

    @Override
    public ProductDto updateProduct(ProductDto uProduct) {
        Product p=productRepository.findById(uProduct.getId()).orElse(null);
        if(Objects.isNull(p))
        {
            throw new NullPointerException("OBJE BOS OLAMAZ!");
        }
        p.setTitle(uProduct.getTitle());
        p.setCategory(categoryRepository.findById(uProduct.getCategory_id()).orElse(null));
        productRepository.save(p);
        return uProduct;
    }

    @Override
    public ProductDto getById(Long id) {
        Product p= this.productRepository.findById(id).orElse(null);
        ProductDto productDto=new ProductDto();
        productDto.setCategory_id(p.getCategory().getId());
        productDto.setId(p.getId());
        productDto.setTitle(p.getTitle());
        return productDto;
    }

    @Override
    public List<ProductDto> getProductByCategoryId(Long id) {
        Category c= categoryRepository.findById(id).orElse(null);
        List<ProductDto> productDtoList=new ArrayList();
        c.getProductSet().forEach(item->{
            ProductDto p=new ProductDto();
            p.setTitle(item.getTitle());
            p.setId(item.getId());
            p.setCategory_id(item.getCategory().getId());
            productDtoList.add(p);
        });
        return productDtoList;
    }

    @Override
    public void delete(Long id) {
         productRepository.deleteById(id);
    }

    @Override
    public List<ProductDto> sortProductsByTitle() {
        List<ProductDto> productDtoList=new java.util.ArrayList();
        productRepository.findProductsByOrderByTitleDesc().forEach(item->{
            ProductDto p=new ProductDto();
            p.setCategory_id(item.getCategory().getId());
            p.setId(item.getId());
            p.setTitle(item.getTitle());
            productDtoList.add(p);
        });
        return productDtoList;
    }
}
