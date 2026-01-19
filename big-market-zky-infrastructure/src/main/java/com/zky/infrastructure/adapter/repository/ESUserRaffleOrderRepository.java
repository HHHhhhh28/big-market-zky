package com.zky.infrastructure.adapter.repository;

import com.zky.infrastructure.elasticsearch.IElasticSearchUserRaffleOrderDao;
import com.zky.infrastructure.elasticsearch.po.UserRaffleOrder;
import com.zky.querys.adapter.repository.IESUserRaffleOrderRepository;
import com.zky.querys.model.valobj.ESUserRaffleOrderVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zky
 * @description
 * @create
 */
@Slf4j
@Repository
public class ESUserRaffleOrderRepository implements IESUserRaffleOrderRepository {

    @Resource
    private IElasticSearchUserRaffleOrderDao elasticSearchUserRaffleOrderDao;

    @Override
    public List<ESUserRaffleOrderVO> queryESUserRaffleOrderVOList() {
        // 查询数据
        List<UserRaffleOrder> userRaffleOrders = elasticSearchUserRaffleOrderDao.queryUserRaffleOrderList();
        // 封装数据
        List<ESUserRaffleOrderVO> esUserRaffleOrderVOS = new ArrayList<>();
        for (UserRaffleOrder userRaffleOrder: userRaffleOrders){
            ESUserRaffleOrderVO esUserRaffleOrderVO = ESUserRaffleOrderVO.builder()
                        .userId(userRaffleOrder.getUserId())
                        .activityId(userRaffleOrder.getActivityId())
                        .activityName(userRaffleOrder.getActivityName())
                        .strategyId(userRaffleOrder.getStrategyId())
                        .orderId(userRaffleOrder.getOrderId())
                        .orderTime(userRaffleOrder.getOrderTime())
                        .orderState(userRaffleOrder.getOrderState())
                        .createTime(userRaffleOrder.getCreateTime())
                        .updateTime(userRaffleOrder.getUpdateTime())
                        .build();
            esUserRaffleOrderVOS.add(esUserRaffleOrderVO);
        }
        return esUserRaffleOrderVOS;
    }

}
