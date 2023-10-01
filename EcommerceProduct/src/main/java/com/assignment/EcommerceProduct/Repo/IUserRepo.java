package com.assignment.EcommerceProduct.Repo;

import com.assignment.EcommerceProduct.Model.Order;
import com.assignment.EcommerceProduct.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Integer> {
}
