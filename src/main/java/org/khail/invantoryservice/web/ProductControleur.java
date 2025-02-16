package org.khail.invantoryservice.web;

import org.khail.invantoryservice.Repository.ProductRepositry;
import org.khail.invantoryservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
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
}
