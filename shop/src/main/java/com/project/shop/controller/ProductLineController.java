package com.project.shop.controller;

import com.project.shop.entities.ProductLine;
import com.project.shop.repositories.ProductLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("cart")
public class ProductLineController {
    @Autowired
    private ProductLineRepository productLineRepository;

    @GetMapping("/lines")
    public String linesPage(Model model){
        List<ProductLine> productlines = productLineRepository.findAll();
        model.addAttribute("productlines", productlines);
        return "product-lines";
    }
}
