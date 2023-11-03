package com.asac.SpringCoupang.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.security.Timestamp;

@Data
@Entity
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String shippingStatus;
    private Timestamp shippedDate;
    private Timestamp estimatedArrivalDate;

    @ManyToOne
    @JoinColumn(name = "order_detail_id")
    private OrderDetail orderDetail;
}
