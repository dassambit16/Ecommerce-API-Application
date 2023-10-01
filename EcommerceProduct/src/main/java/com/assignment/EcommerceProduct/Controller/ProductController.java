package com.assignment.EcommerceProduct.Controller;

import com.assignment.EcommerceProduct.Model.Category;
import com.assignment.EcommerceProduct.Model.Product;
import com.assignment.EcommerceProduct.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> products) {
        return productService.addProducts(products);
    }

    @GetMapping("product/category/{category}")
    public List<Product> getProductsByCategory(@PathVariable Category category) {
        return (List<Product>) productService.getProductsByCategory(category);
    }

    @DeleteMapping("product/id/{id}")
    public String deleteById(@PathVariable Integer id) {
        return productService.deleteById(id);
    }
}
