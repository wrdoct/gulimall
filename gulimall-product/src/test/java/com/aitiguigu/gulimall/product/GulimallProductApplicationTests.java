package com.aitiguigu.gulimall.product;

import com.aitiguigu.gulimall.product.entity.BrandEntity;
import com.aitiguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        System.out.println("查询成功");
        List<BrandEntity> list = brandService.list();
        System.out.println(list);
    }

}
