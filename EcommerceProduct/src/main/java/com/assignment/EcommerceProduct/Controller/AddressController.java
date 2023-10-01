package com.assignment.EcommerceProduct.Controller;

import com.assignment.EcommerceProduct.Model.Address;
import com.assignment.EcommerceProduct.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody List<Address> addresses) {
        return addressService.addAddress(addresses);
    }
}
