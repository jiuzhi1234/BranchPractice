package com.jzp.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jzp.common.utils.PageUtils;
import com.jzp.gulimail.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author jzp
 * @email 2745588458@qq.com
 * @date 2024-03-14 09:03:33
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

