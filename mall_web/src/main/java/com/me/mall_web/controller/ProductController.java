package com.me.mall_web.controller;

import com.me.mall_web.service.ProductService;
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
    public String getById(@RequestParam int id) {
        String result = "fail";
        try {
            result = productService.getProductInfoById(id);
        } catch (Exception e) {
            logger.error("get product error, id = {}", id, e);
        }
        return result;
    }

}
