package com.zky.infrastructure.persistent.dao;

import com.zky.infrastructure.persistent.po.StrategyAward;
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

}
