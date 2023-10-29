package com.asac.SpringCoupang.controller;

import com.asac.SpringCoupang.Entity.ProductDetail;
import com.asac.SpringCoupang.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDetail> getProductDetail(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductDetail(id));
    }

    @PostMapping
    public ResponseEntity<Void> addProductDetail(@RequestBody ProductDetail productDetail) {
        productService.addProductDetail(productDetail);

        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateProductDetail(@PathVariable Long id, @RequestBody ProductDetail productDetail) {
        productDetail.setId(id);
        productService.updateProductDetail(productDetail);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductDetail(@PathVariable Long id) {
        productService.deleteProductDetail(id);

        return ResponseEntity.ok().build();
    }
}
