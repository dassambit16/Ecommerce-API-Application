package com.assignment.EcommerceProduct.Service;

import com.assignment.EcommerceProduct.Model.Address;
import com.assignment.EcommerceProduct.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(List<Address> addresses) {
        addressRepo.saveAll(addresses);
        return "added!!";
    }
}
