package org.khail.invantoryservice.web;

import org.springframework.security.core.Authentication;
import org.khail.invantoryservice.Repository.ProductRepositry;
import org.khail.invantoryservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductControleur {
    @Autowired
    private ProductRepositry productRepositry;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productRepositry.findAll();
    }
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return productRepositry.findById(id).get();
    }
    @GetMapping("/auth")
    public Authentication authentication( Authentication authentication) {
        return authentication ;
    }
}
