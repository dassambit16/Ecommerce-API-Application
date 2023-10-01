package com.assignment.EcommerceProduct.Repo;

import com.assignment.EcommerceProduct.Model.Address;
import com.assignment.EcommerceProduct.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
