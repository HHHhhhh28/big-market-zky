package com.zky.querys.adapter.repository;


import com.zky.querys.model.valobj.ESUserRaffleOrderVO;

import java.util.List;

/**
 * @author zky
 * @description ElasticSearch 用户抽奖订单表查询
 * @create
 */
public interface IESUserRaffleOrderRepository {

    List<ESUserRaffleOrderVO> queryESUserRaffleOrderVOList();


}
