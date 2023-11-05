package com.asac.SpringCoupang.Entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QProductDetail is a Querydsl query type for ProductDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QProductDetail extends EntityPathBase<ProductDetail> {

    private static final long serialVersionUID = 123643818L;

    public static final QProductDetail productDetail = new QProductDetail("productDetail");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public QProductDetail(String variable) {
        super(ProductDetail.class, forVariable(variable));
    }

    public QProductDetail(Path<? extends ProductDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProductDetail(PathMetadata metadata) {
        super(ProductDetail.class, metadata);
    }

}

