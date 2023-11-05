package com.asac.SpringCoupang.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderDetail is a Querydsl query type for OrderDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderDetail extends EntityPathBase<OrderDetail> {

    private static final long serialVersionUID = 20363593L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderDetail orderDetail = new QOrderDetail("orderDetail");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QOrder order;

    public final QProductOption productOption;

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final QSellersProduct sellersProduct;

    public final ListPath<Shipment, QShipment> shipment = this.<Shipment, QShipment>createList("shipment", Shipment.class, QShipment.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> unitPrice = createNumber("unitPrice", java.math.BigDecimal.class);

    public QOrderDetail(String variable) {
        this(OrderDetail.class, forVariable(variable), INITS);
    }

    public QOrderDetail(Path<? extends OrderDetail> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderDetail(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderDetail(PathMetadata metadata, PathInits inits) {
        this(OrderDetail.class, metadata, inits);
    }

    public QOrderDetail(Class<? extends OrderDetail> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrder(forProperty("order"), inits.get("order")) : null;
        this.productOption = inits.isInitialized("productOption") ? new QProductOption(forProperty("productOption"), inits.get("productOption")) : null;
        this.sellersProduct = inits.isInitialized("sellersProduct") ? new QSellersProduct(forProperty("sellersProduct"), inits.get("sellersProduct")) : null;
    }

}

