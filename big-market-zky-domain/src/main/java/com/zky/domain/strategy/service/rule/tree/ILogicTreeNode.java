package com.zky.domain.strategy.service.rule.tree;


import com.zky.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

/**
 * @author zky
 * @description 规则树接口
 * @create
 */
public interface ILogicTreeNode {

    DefaultTreeFactory.TreeActionEntity logic(String userId, Long strategyId, Integer awardId, String ruleValue);

}
