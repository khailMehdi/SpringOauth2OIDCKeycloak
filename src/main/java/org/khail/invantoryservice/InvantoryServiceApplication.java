package org.khail.invantoryservice;

import org.khail.invantoryservice.Repository.ProductRepositry;
import org.khail.invantoryservice.entity.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvantoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvantoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(ProductRepositry productRepositry){
        return args -> {
            Product product1 = new Product(1, "PC", "6666", 2);
            Product product2 = new Product(2, "Phone", "7777", 2);
            Product product3 = new Product(3, "iPhone", "5555", 2);

            productRepositry.save(product1);
            productRepositry.save(product2);
            productRepositry.save(product3);



        };
}
}
