package com.zky.domain.activity.service.quota.rule;

/**
 * @author zky
 * @description
 * @create
 */
public interface IActionChainArmory {

    IActionChain next();

    IActionChain appendNext(IActionChain next);

}
