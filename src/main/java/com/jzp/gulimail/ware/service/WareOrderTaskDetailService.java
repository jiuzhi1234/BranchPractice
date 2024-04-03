package com.jzp.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jzp.common.utils.PageUtils;
import com.jzp.gulimail.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author jzp
 * @email 2745588458@qq.com
 * @date 2024-03-14 09:03:34
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

