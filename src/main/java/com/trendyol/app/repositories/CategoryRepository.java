package com.trendyol.app.repositories;

import com.trendyol.app.entity.Category;
import com.trendyol.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    //get By Propert : COMPLETED
    java.util.List<Category> getCategoriesByCategoryTitle(@Param("categoryTitle") String categoryTitle);

    //order By property and asc-desc
    java.util.List<Category> findCategoriesByOrderByIdDesc();

    //Custom Query and Params
    @Query("SELECT distinct c FROM Category as c join Product as p on c.id=p.category.id where c.productSet.size>:qSize")
    List<Category> getCategoryByCustomQuery(@Param("qSize") int size);

}
