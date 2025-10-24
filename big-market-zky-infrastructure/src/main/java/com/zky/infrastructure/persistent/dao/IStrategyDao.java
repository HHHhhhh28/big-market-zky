package com.zky.infrastructure.persistent.dao;

import com.zky.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zky
 * @description 抽奖策略 DAO
 * @create
 */
@Mapper
public interface IStrategyDao {

    List<Strategy> queryStrategyList();

}
