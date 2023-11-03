package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "seller_product_id")
    private SellersProduct sellersProduct;

    @ManyToOne
    @JoinColumn(name = "product_option_id")
    private ProductOption productOption;
}
