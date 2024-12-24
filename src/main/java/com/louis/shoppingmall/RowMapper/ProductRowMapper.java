package com.louis.shoppingmall.RowMapper;

import com.louis.shoppingmall.Constant.ProductCategory;
import com.louis.shoppingmall.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));

         String categoryStr=rs.getString("category");
         ProductCategory category = ProductCategory.valueOf(categoryStr);
         product.setCategory(category);

      //      product.setCategory(ProductCategory.valueOf(rs.getString("category")));



        product.setDescription(rs.getString("description"));
        product.setImageUrl(rs.getString("image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));
        product.setCreatedDate(rs.getDate("created_date"));
        product.setLastModifiedDate(rs.getDate("last_modified_date"));
        return product;
    }
}
