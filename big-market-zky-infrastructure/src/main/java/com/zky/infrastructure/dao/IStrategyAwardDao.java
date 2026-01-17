package com.zky.infrastructure.dao;

import com.zky.infrastructure.dao.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zky
 * @description 抽奖策略奖品明细配置 - 概率、规则 DAO
 * @create
 */
@Mapper
public interface IStrategyAwardDao {

    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);

    String queryStrategyAwardRuleModels(StrategyAward strategyAward);


    void updateStrategyAwardStock(StrategyAward strategyAward);

    StrategyAward queryStrategyAward(StrategyAward strategyAwardReq);

    List<StrategyAward> queryOpenActivityStrategyAwardList();
}
