package com.zky.domain.strategy.service.rule.chain;

/**
 * @author zky
 * @description 责任链装配
 * @create
 */
public interface ILogicChainArmory {

    ILogicChain next();

    ILogicChain appendNext(ILogicChain next);

}
