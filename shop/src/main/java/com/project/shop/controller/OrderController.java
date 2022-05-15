package com.project.shop.controller;

import com.project.shop.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("cart")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
}
