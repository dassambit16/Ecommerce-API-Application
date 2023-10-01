package com.assignment.EcommerceProduct.Controller;

import com.assignment.EcommerceProduct.Model.Order;
import com.assignment.EcommerceProduct.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping ("order/id/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("order/place/{order}")
    public String addOrders(@PathVariable Order order) {
        return orderService.addOrders(order);
    }

    public String deleteOrderById(@PathVariable Integer id) {
        return orderService.deleteOrderById(id);
    }
}
