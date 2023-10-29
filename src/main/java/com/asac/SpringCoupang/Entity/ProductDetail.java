package com.asac.SpringCoupang.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDetail {
    private Long id;
    private String name;
    private String description;
    private Double price;
}
