package com.assignment.EcommerceProduct.Service;

import com.assignment.EcommerceProduct.Model.User;
import com.assignment.EcommerceProduct.Repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;


    public String addUsers(List<User> users) {
        userRepo.saveAll(users);
        return users.size() + " users are added!!";
    }

    public Optional<User> getUserById(Integer id) {
        return userRepo.findById(id);
    }
}
