package com.aitiguigu.gulimall.order.dao;

import com.aitiguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author llw
 * @email llw18729357726@163.com
 * @date 2024-03-26 16:47:47
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
