package com.assignment.EcommerceProduct.Repo;

import com.assignment.EcommerceProduct.Model.Category;
import com.assignment.EcommerceProduct.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<Product, Integer> {
    Product findByCategory(Category category);
}
