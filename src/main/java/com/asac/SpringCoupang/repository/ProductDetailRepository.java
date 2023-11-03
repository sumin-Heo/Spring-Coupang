package com.asac.SpringCoupang.repository;

import com.asac.SpringCoupang.Entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {

    @Query("SELECT p FROM ProductDetail p WHERE p.name = :name")
    List<ProductDetail> findProductDetailByName(String name);
}
