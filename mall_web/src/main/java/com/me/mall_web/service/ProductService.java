package com.me.mall_web.service;

import com.me.mall_web.feign.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductFeignClient productFeignClient;

    public String getProductInfoById(int id) throws Exception {
        return productFeignClient.getProductInfoById(id);
    }

}
