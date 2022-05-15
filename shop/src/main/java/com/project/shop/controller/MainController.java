package com.project.shop.controller;

import com.project.shop.entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@SessionAttributes("cart")
public class MainController {
    @GetMapping("/")
    public RedirectView homePage(){
        return new RedirectView("home");
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "about";
    }

    @GetMapping("/person/{name}")
    public String personalPage(@PathVariable("name") String name) {
        if (name.equals("astrid")) {
            return "astrid";
        } else if (name.equals("felicia")) {
            return "felicia";
        } else if (name.equals("robin")) {
            return "robin";
        } else {
            return "redirect:/about";
        }
    }
}
