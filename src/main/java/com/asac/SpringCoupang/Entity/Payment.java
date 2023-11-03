package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.security.Timestamp;

@Data
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String paymentMethod;
    private BigDecimal paymentAmount;
    private Timestamp paymentDate;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
