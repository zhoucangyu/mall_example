package com.me.mall_product_cloud.dao;

import com.me.mall_product_cloud.entity.ProductEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductDao {

    @Select("select * from product_info where id = ${id}")
    public ProductEntity getById(int id);

}
