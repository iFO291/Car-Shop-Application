package com.project.shop.controller;

import com.project.shop.entities.Product;
import com.project.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    // ************* SHOW HOME WIT TOP 10 PRODUCTS ************** //
    @GetMapping("/home")
    public String homePage(Model model) {
        List<Product> products = productRepository.findTop10ByOrderByQuantityinstockAsc();
        model.addAttribute("products", products);
        return "index";
    }

    // ************* SHOW SPECIFIC PRODUCT DETAILS ************** //
    @GetMapping("/details/{productcode}")
    public ModelAndView showAddedProduct(@PathVariable(name = "productcode") String productcode) {
        ModelAndView modelAndView = new ModelAndView("product-details");
        Product product = productRepository.findById(productcode).get();
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    // ************* SHOW ALL PRODUCTS ************** //
    @GetMapping("/all")
    public String viewAllProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "all-products";
    }
}
