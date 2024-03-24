package com.aitiguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.aitiguigu.common.utils.PageUtils;
import com.aitiguigu.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author llw
 * @email llw18729357726@163.com
 * @date 2024-03-24 22:30:33
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

