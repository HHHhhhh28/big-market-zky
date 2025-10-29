package com.zky.domain.strategy.service.rule.filter;


import com.zky.domain.strategy.model.entity.RuleActionEntity;
import com.zky.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author zky
 * @description 抽奖规则过滤接口
 * @create
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {

    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);

}
