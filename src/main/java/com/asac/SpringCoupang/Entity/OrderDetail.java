package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    private BigDecimal unitPrice;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "seller_product_id")
    private SellersProduct sellersProduct;

    @ManyToOne
    @JoinColumn(name = "product_option_id")
    private ProductOption productOption;

    @OneToMany(mappedBy = "orderDetail")
    private List<Shipment> shipment;
}
