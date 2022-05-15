package com.project.shop.controller;

import com.project.shop.entities.Customer;
import com.project.shop.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@SessionAttributes("cart")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/save")
    public String saveCustomer(@Valid Customer customer, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "new-customer";
        }
        customerRepository.save(customer);
        return "redirect:/";
    }

    @GetMapping("/new")
    public String newCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "new-customer";
    }
}
