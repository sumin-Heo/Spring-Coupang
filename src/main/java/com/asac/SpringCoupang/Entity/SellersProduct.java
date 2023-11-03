package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class SellersProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer stockQuantity;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User sellers;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToMany(mappedBy = "sellersProduct")
    private List<OrderDetail> orderDetail;

    @OneToMany(mappedBy = "sellersProduct")
    private List<CartItem> cartItem;
}
