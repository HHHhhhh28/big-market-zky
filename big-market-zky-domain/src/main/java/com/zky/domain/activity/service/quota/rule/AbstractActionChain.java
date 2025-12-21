package com.zky.domain.activity.service.quota.rule;

/**
 * @author zky
 * @description 下单规则责任链抽象类
 * @create
 */
public abstract class AbstractActionChain implements IActionChain {

    private IActionChain next;

    @Override
    public IActionChain next() {
        return next;
    }

    @Override
    public IActionChain appendNext(IActionChain next) {
        this.next = next;
        return next;
    }

}
