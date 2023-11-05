package com.asac.SpringCoupang.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrder is a Querydsl query type for Order
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrder extends EntityPathBase<Order> {

    private static final long serialVersionUID = 1227241176L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrder order = new QOrder("order1");

    public final SimplePath<java.security.Timestamp> createdAt = createSimple("createdAt", java.security.Timestamp.class);

    public final QUser customer;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<OrderDetail, QOrderDetail> orderDetail = this.<OrderDetail, QOrderDetail>createList("orderDetail", OrderDetail.class, QOrderDetail.class, PathInits.DIRECT2);

    public final ListPath<Payment, QPayment> payment = this.<Payment, QPayment>createList("payment", Payment.class, QPayment.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> totalPrice = createNumber("totalPrice", java.math.BigDecimal.class);

    public QOrder(String variable) {
        this(Order.class, forVariable(variable), INITS);
    }

    public QOrder(Path<? extends Order> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrder(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrder(PathMetadata metadata, PathInits inits) {
        this(Order.class, metadata, inits);
    }

    public QOrder(Class<? extends Order> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.customer = inits.isInitialized("customer") ? new QUser(forProperty("customer")) : null;
    }

}

