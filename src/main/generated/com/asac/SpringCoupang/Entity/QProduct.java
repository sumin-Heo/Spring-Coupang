package com.asac.SpringCoupang.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QProduct is a Querydsl query type for Product
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProduct extends EntityPathBase<Product> {

    private static final long serialVersionUID = -839597575L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QProduct product = new QProduct("product");

    public final NumberPath<java.math.BigDecimal> basePrice = createNumber("basePrice", java.math.BigDecimal.class);

    public final QCategory category;

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final ListPath<ProductOption, QProductOption> productOption = this.<ProductOption, QProductOption>createList("productOption", ProductOption.class, QProductOption.class, PathInits.DIRECT2);

    public final ListPath<Review, QReview> review = this.<Review, QReview>createList("review", Review.class, QReview.class, PathInits.DIRECT2);

    public final ListPath<SellersProduct, QSellersProduct> sellersProduct = this.<SellersProduct, QSellersProduct>createList("sellersProduct", SellersProduct.class, QSellersProduct.class, PathInits.DIRECT2);

    public QProduct(String variable) {
        this(Product.class, forVariable(variable), INITS);
    }

    public QProduct(Path<? extends Product> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QProduct(PathMetadata metadata, PathInits inits) {
        this(Product.class, metadata, inits);
    }

    public QProduct(Class<? extends Product> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QCategory(forProperty("category"), inits.get("category")) : null;
    }

}

