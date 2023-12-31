package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ProductDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private Double price;
}
