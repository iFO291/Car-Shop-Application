package com.project.shop.controller;

import com.project.shop.entities.Product;
import com.project.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@SessionAttributes("cart")
public class CartController {
    @Autowired
    private ProductRepository productRepository;
    private List<Product> myProducts;
    public List<Product> getMyProducts() {
        return this.myProducts;
    }
    @ModelAttribute("cart")
    public List<Product> initCart(){
        if(this.myProducts == null){
            List<Product> prods = new ArrayList<>();
            setMyProducts(prods);
            return this.getMyProducts();
        }
        else{
            return this.getMyProducts();
        }
    }
    public void setMyProducts(List<Product> myProducts) {
        this.myProducts = myProducts;
    }

    @GetMapping("/cart")
    public String cart(@SessionAttribute("cart") List<Product> cart, final Model model){
        int quantity = 0;
        for (int i = 0; i < cart.size(); i++){
            for (int j = 0; j < cart.size(); j++){
                if(cart.get(i) == cart.get(j)){
                    continue;
                }
                else if(cart.get(i) != cart.get(j) && cart.get(i).getProductcode() == cart.get(j).getProductcode()){
                    quantity++;
                    cart.get(i).setQuantityincart(quantity);
                }
            }
        }
        if(cart.isEmpty() && cart == null  ){
            model.addAttribute("cart", new ArrayList<>());
        }
        else{
            model.addAttribute("cart", cart);
        }
        return "shopping-cart";
    }
    @PostMapping(value = "/add/{productcode}")
    public String addToCart(@PathVariable(name = "productcode") String productcode, @ModelAttribute("cart") List<Product> cart) {
        Product product = productRepository.findById(productcode).get();
        if(cart != null){
            boolean isItemPresent = cart.stream().anyMatch(item -> item.getProductcode().equals(product.getProductcode()));
            if (!isItemPresent) {
                product.setQuantityincart(1);
                cart.add(product);
            } else {
                for (int i = 0; i < cart.size(); i++){
                    if(cart.get(i).getProductcode().equals(product.getProductcode())){
                        cart.get(i).setQuantityincart(cart.get(i).getQuantityincart() + 1);
                    }
                }
            }
        }
        else{
            List<Product> products = new ArrayList<>();
            products.add(product);
            products.get(0).setQuantityincart(1);
            setMyProducts(products);
        }
        return "redirect:/";
    }
}
