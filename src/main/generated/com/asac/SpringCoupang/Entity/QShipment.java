package com.asac.SpringCoupang.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QShipment is a Querydsl query type for Shipment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QShipment extends EntityPathBase<Shipment> {

    private static final long serialVersionUID = 229711312L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShipment shipment = new QShipment("shipment");

    public final SimplePath<java.security.Timestamp> estimatedArrivalDate = createSimple("estimatedArrivalDate", java.security.Timestamp.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QOrderDetail orderDetail;

    public final SimplePath<java.security.Timestamp> shippedDate = createSimple("shippedDate", java.security.Timestamp.class);

    public final StringPath shippingStatus = createString("shippingStatus");

    public QShipment(String variable) {
        this(Shipment.class, forVariable(variable), INITS);
    }

    public QShipment(Path<? extends Shipment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShipment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShipment(PathMetadata metadata, PathInits inits) {
        this(Shipment.class, metadata, inits);
    }

    public QShipment(Class<? extends Shipment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.orderDetail = inits.isInitialized("orderDetail") ? new QOrderDetail(forProperty("orderDetail"), inits.get("orderDetail")) : null;
    }

}

