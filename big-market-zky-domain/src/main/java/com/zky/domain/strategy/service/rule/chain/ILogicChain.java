package com.zky.domain.strategy.service.rule.chain;

/**
 * @author zky
 * @description 抽奖策略规则责任链接口
 * @create
 */
public interface ILogicChain extends ILogicChainArmory{

    /**
     * 责任链接口
     *
     * @param userId     用户ID
     * @param strategyId 策略ID
     * @return 奖品ID
     */
    Integer logic(String userId, Long strategyId);

}
