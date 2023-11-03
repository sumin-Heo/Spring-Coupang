package com.asac.SpringCoupang.repository;

import com.asac.SpringCoupang.Entity.ProductDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ProductDetailRepository {
    private final JdbcTemplate jdbcTemplate;

    private RowMapper<ProductDetail> productDetailRowMapper = (rs, rowNum) -> {
        ProductDetail productDetail = new ProductDetail();
        productDetail.setId(rs.getInt("id"));
        productDetail.setName(rs.getString("name"));
        productDetail.setDescription(rs.getString("description"));
        productDetail.setPrice(rs.getDouble("price"));
        return productDetail;
    };

    public ProductDetail findById(Long id) {
        String sql = "SELECT id, name, description, price FROM product_detail WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, productDetailRowMapper, id);
    }

    public int insertProductDetail(ProductDetail productDetail) {
        String sql = "INSERT INTO product_detail (name, description, price) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, productDetail.getName(), productDetail.getDescription(), productDetail.getPrice());
    }

    public int updateProductDetail(ProductDetail productDetail) {
        String sql = "UPDATE product_detail SET name = ?, description = ?, price = ? WHERE id = ?";
        return jdbcTemplate.update(sql, productDetail.getName(), productDetail.getDescription(), productDetail.getPrice(), productDetail.getId());
    }

    public int deleteProductDetail(Long id) {
        String sql = "DELETE FROM product_detail WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
