package com.louis.shoppingmall.service.impl;

import com.louis.shoppingmall.dao.ProductDao;
import com.louis.shoppingmall.model.Product;
import com.louis.shoppingmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
