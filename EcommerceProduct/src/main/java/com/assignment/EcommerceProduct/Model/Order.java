package com.assignment.EcommerceProduct.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_userId")
    User user;
    @ManyToOne
    @JoinColumn(name = "fk_productId")
    Product product;
    @ManyToOne
    @JoinColumn(name = "fk_addressId")
    Address address;
    private Integer productQuantity;
}
