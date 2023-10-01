package com.assignment.EcommerceProduct.Service;

import com.assignment.EcommerceProduct.Model.Category;
import com.assignment.EcommerceProduct.Model.Product;
import com.assignment.EcommerceProduct.Repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;

    public String addProducts(List<Product> products) {
        productRepo.saveAll(products);
        return products.size() + " products are added!!";
    }

    public Product getProductsByCategory(Category category) {
        return productRepo.findByCategory(category);
    }

    public String deleteById(Integer id) {
        productRepo.deleteById(id);
        return "deleted!!";
    }
}
