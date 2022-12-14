package com.trendyol.app.controller;


import com.trendyol.app.category.services.CategoryService;
import com.trendyol.app.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
@CrossOrigin("*")
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

    @RequestMapping(value="/d/{id}",method=RequestMethod.DELETE)
    public ResponseEntity deleteCategory(@PathVariable Long id){
        try{
            categoryService.delete(id);
            return ResponseEntity.ok("Silindi");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(new Exception("Bir Sorun Oluştu"));
        }
    }

    @RequestMapping(value="/",method=RequestMethod.GET)
    public ResponseEntity<java.util.List<CategoryDto>> getCategoriesByName(@RequestParam String name){
        return ResponseEntity.ok(categoryService.getCategoryByName(name));
    }


    @RequestMapping(value = "/sorted",method=RequestMethod.GET)
    public ResponseEntity<java.util.List<CategoryDto>> getSortedCategories(){
        return ResponseEntity.ok(categoryService.getAllSortedCategories());
    }

    @RequestMapping(value="/condition",method=RequestMethod.GET)
    public ResponseEntity<List<CategoryDto>> getCategoriesByRequiredProductSize(@RequestParam int size){
        return ResponseEntity.ok(categoryService.getAllCategoriesByProductSize(size));
    }

}
