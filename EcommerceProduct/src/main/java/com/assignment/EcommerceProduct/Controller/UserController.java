package com.assignment.EcommerceProduct.Controller;

import com.assignment.EcommerceProduct.Model.User;
import com.assignment.EcommerceProduct.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("users")
    public String addUsers(@RequestBody List<User> users) {
        return userService.addUsers(users);
    }

    @GetMapping("user/id/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

}
