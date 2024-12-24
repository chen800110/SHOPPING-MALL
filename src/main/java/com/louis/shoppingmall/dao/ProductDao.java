package com.louis.shoppingmall.dao;

import com.louis.shoppingmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
