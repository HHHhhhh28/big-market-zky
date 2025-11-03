package com.zky.domain.strategy.service.rule.tree.factory.engine;


import com.zky.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author zky
 * @description 规则树组合接口
 * @create
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardData process(String userId, Long strategyId, Integer awardId);

}
