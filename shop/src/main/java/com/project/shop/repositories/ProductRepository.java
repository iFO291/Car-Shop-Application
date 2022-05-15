package com.project.shop.repositories;

import com.project.shop.entities.Product;
import com.project.shop.entities.ProductLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findTop10ByOrderByQuantityinstockAsc();
    List<Product> findAllByProductline(String productline);
}
