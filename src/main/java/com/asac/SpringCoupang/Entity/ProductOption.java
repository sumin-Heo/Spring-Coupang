package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class ProductOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String optionName;
    private BigDecimal additionalPrices;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToMany(mappedBy = "productOption")
    private List<OrderDetail> orderDetail;

    @OneToMany(mappedBy = "productOption")
    private List<CartItem> cartItem;
}
