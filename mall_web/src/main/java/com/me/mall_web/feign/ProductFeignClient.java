package com.me.mall_web.feign;

import com.me.mall_web.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "mall-product-cloud", configuration = FeignConfig.class)
public interface ProductFeignClient {

    @GetMapping(value = "/product/getById")
    String getProductInfoById(@RequestParam int id);


}
