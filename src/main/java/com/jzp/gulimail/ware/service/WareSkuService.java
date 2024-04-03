package com.jzp.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jzp.common.utils.PageUtils;
import com.jzp.gulimail.ware.entity.WareSkuEntity;
import com.jzp.gulimail.ware.vo.SkuHasStockVo;

import java.util.List;
import java.util.Map;

/**
 * 商品库存
 *
 * @author jzp
 * @email 2745588458@qq.com
 * @date 2024-03-14 09:03:34
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void addStock(Long skuId, Long wareId, Integer skuNum);

    List<SkuHasStockVo> getSkusHasStock(List<Long> skuIds);
}

