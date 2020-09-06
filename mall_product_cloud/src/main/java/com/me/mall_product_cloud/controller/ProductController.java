package com.me.mall_product_cloud.controller;

import com.alibaba.fastjson.JSON;
import com.me.mall_product_cloud.entity.ProductEntity;
import com.me.mall_product_cloud.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping("getById")
    public String getProductById(@RequestParam int id) {
        ProductEntity entity = new ProductEntity();
        try {
            entity = productService.getProductById(id);
        } catch (Exception e) {
            logger.error("get product error, id = {}", id, e);
        }
        return JSON.toJSONString(entity);
    }

}
