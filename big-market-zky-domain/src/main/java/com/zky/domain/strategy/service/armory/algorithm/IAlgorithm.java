package com.zky.domain.strategy.service.armory.algorithm;


import com.zky.domain.strategy.model.entity.StrategyAwardEntity;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zky
 * @description 抽奖算法
 * @create
 */
public interface IAlgorithm {

    void armoryAlgorithm(String key, List<StrategyAwardEntity> strategyAwardEntities, BigDecimal rateRange);

    Integer dispatchAlgorithm(String key);

}
