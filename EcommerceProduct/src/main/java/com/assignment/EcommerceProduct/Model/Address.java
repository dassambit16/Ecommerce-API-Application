package com.assignment.EcommerceProduct.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String landmark;
    private Long phoneNumber;
    private Integer zipcode;
    private String state;

    @ManyToOne
    @JoinColumn(name = "fk_addressId")
    User user;
}
