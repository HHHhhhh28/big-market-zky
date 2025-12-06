package com.zky.infrastructure.persistent.dao;

import com.zky.infrastructure.persistent.po.RaffleActivitySku;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zky
 * @description 商品sku dao
 * @create
 */
@Mapper
public interface IRaffleActivitySkuDao {

    RaffleActivitySku queryActivitySku(Long sku);

}
