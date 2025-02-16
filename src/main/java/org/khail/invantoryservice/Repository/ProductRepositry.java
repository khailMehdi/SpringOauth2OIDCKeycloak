package org.khail.invantoryservice.Repository;

import org.khail.invantoryservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositry extends JpaRepository<Product, Integer> {
}
