package com.example.demo.persist;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    //获取产品
    public Product getProduct(Long id);

    //减库存
    public int decreaseProduct(@Param("id") Long id, @Param("quantity") int quantity);
}
