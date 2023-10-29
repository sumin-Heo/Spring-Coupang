package com.asac.SpringCoupang.service;

import com.asac.SpringCoupang.Entity.ProductDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.asac.SpringCoupang.repository.ProductDetailRepository;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductDetailRepository productDetailRepository;

    public ProductDetail getProductDetail(Long id) {
        return productDetailRepository.findById(id);
    }
    public void addProductDetail(ProductDetail productDetail) {
        productDetailRepository.insertProductDetail(productDetail);
    }
    public void updateProductDetail(ProductDetail productDetail) {
        productDetailRepository.updateProductDetail(productDetail);
    }
    public void deleteProductDetail(Long id) {
        productDetailRepository.deleteProductDetail(id);
    }
}
