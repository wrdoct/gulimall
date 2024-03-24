package com.aitiguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aitiguigu.common.utils.PageUtils;
import com.aitiguigu.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author llw
 * @email llw18729357726@163.com
 * @date 2024-03-24 22:30:33
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

