package com.assignment.EcommerceProduct.Service;

import com.assignment.EcommerceProduct.Model.Order;
import com.assignment.EcommerceProduct.Repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;


    public Optional<Order> getOrderById(Integer id) {
        return orderRepo.findById(id);
    }


    public String addOrders(Order order) {
        orderRepo.save(order);
        return "added!!";
    }

    public String deleteOrderById(Integer id) {
        orderRepo.deleteById(id);
        return "deleted";
    }
}
