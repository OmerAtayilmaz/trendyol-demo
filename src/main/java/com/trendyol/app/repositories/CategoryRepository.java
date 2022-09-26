package com.trendyol.app.repositories;

import com.trendyol.app.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    // ORDER ASCENDING QUERY

    // GROUP BY PARENT ID

    // JOIN

}
