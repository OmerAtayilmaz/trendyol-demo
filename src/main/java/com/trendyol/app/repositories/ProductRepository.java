package com.trendyol.app.repositories;

import com.trendyol.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findProductsByOrderByTitleDesc();
}
