package com.assignment.EcommerceProduct.Repo;

import com.assignment.EcommerceProduct.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepo extends JpaRepository<Order, Integer> {

}
