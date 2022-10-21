package com.trendyol.app.controller;

import com.trendyol.app.dto.ProductDto;
import com.trendyol.app.product.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/product")
@CrossOrigin("*")
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
        return productService.getAll();
    }
    @PutMapping()
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto p){
        return ResponseEntity.ok(productService.updateProduct(p));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id){
        return ResponseEntity.ok(productService.getById(id));
    }

    @GetMapping("/c/{category_id}")
    public ResponseEntity<List<ProductDto>> getProductsByCategoryId(@PathVariable Long category_id){
        return ResponseEntity.ok(productService.getProductByCategoryId(category_id));
    }

    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public ResponseEntity<String> deleteProductById(@PathVariable Long id){
        //return ResponseEntity.status(200).body("Deleted Successfully!");
        productService.delete(id);
        return ResponseEntity.status(204).body(null);
    }

    //Sorting by name
    @GetMapping("/s")
    public ResponseEntity sortProductsByTitle(){
        return ResponseEntity.status(org.springframework.http.HttpStatus.OK).body(productService.sortProductsByTitle());
    }

}
