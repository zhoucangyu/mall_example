package com.me.mall_product_cloud.service;

import com.me.mall_product_cloud.dao.ProductDao;
import com.me.mall_product_cloud.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public ProductEntity getProductById(int id) throws Exception {
        return productDao.getById(id);
    }

}
