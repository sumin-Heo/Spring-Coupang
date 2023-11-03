package com.asac.SpringCoupang.service;

import com.asac.SpringCoupang.Entity.ProductDetail;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.asac.SpringCoupang.repository.ProductDetailRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductDetailRepository productDetailRepository;

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
        return productDetailRepository.findProductDetailByName(name);
    }
}
