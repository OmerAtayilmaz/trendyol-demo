package com.trendyol.app.controller;


import com.trendyol.app.category.services.CategoryService;
import com.trendyol.app.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto){
        categoryService.createCategory(categoryDto);
        return ResponseEntity.ok(categoryDto);
    }

    @RequestMapping(method=RequestMethod.GET)
    public ResponseEntity<ArrayList<CategoryDto>> listAllCategories(){
        try{
            return ResponseEntity.ok(categoryService.listCategories());
        }catch(Exception e){
            return ResponseEntity.ok(null);
        }

    }

    @RequestMapping( value = "/{id}",method=RequestMethod.GET)
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.findById(id));
    }


}
