package com.asac.SpringCoupang.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSellersProduct is a Querydsl query type for SellersProduct
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSellersProduct extends EntityPathBase<SellersProduct> {

    private static final long serialVersionUID = -1850205903L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSellersProduct sellersProduct = new QSellersProduct("sellersProduct");

    public final ListPath<CartItem, QCartItem> cartItem = this.<CartItem, QCartItem>createList("cartItem", CartItem.class, QCartItem.class, PathInits.DIRECT2);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<OrderDetail, QOrderDetail> orderDetail = this.<OrderDetail, QOrderDetail>createList("orderDetail", OrderDetail.class, QOrderDetail.class, PathInits.DIRECT2);

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public final QProduct product;

    public final QUser sellers;

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public QSellersProduct(String variable) {
        this(SellersProduct.class, forVariable(variable), INITS);
    }

    public QSellersProduct(Path<? extends SellersProduct> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSellersProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSellersProduct(PathMetadata metadata, PathInits inits) {
        this(SellersProduct.class, metadata, inits);
    }

    public QSellersProduct(Class<? extends SellersProduct> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
        this.sellers = inits.isInitialized("sellers") ? new QUser(forProperty("sellers")) : null;
    }

}

