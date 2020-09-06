package com.me.mall_web.feign;

import com.me.mall_web.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用feign调用mall-product-cloud微服务的客户端
 * feign即提供一种标准化的请求微服务restful api的方式
 * 还有RestTemplate等其他请求方式
 */
// value对应服务名
@FeignClient(value = "mall-product-cloud", configuration = FeignConfig.class)
public interface ProductFeignClient {

    // getMapping即用get方法请求mall-product-cloud服务的api，path为/product/getById，携带参数id
    @GetMapping(value = "/product/getById")
    String getProductInfoById(@RequestParam int id);


}
