package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.security.Timestamp;

@Data
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rating;
    private String comment;
    private Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
