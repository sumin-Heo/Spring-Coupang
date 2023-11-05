package com.asac.SpringCoupang.service;

import com.asac.SpringCoupang.Entity.ProductDetail;
import com.asac.SpringCoupang.Entity.QProductDetail;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.asac.SpringCoupang.repository.ProductDetailRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductDetailRepository productDetailRepository;
    private final JPAQueryFactory queryFactory;

    public ProductDetail getProductDetail(Long id) {
        return productDetailRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Not found"));
    }
    public void addProductDetail(ProductDetail productDetail) {
        productDetailRepository.save(productDetail);
    }
    public void updateProductDetail(ProductDetail productDetail) {
        productDetailRepository.save(productDetail);
    }
    public void deleteProductDetail(Long id) {
        productDetailRepository.deleteById(id);
    }

    public List<ProductDetail> findProductDetailByName(String name) {
        QProductDetail qProductDetail = QProductDetail.productDetail;
        return queryFactory
                .selectFrom(qProductDetail)
                .where(qProductDetail.name.eq(name)).fetch();
    }
}
