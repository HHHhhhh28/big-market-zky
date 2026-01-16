package com.zky.infrastructure.dao;

import com.zky.infrastructure.dao.po.RaffleActivityCount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zky
 * @description 抽奖活动次数配置表Dao
 * @create
 */
@Mapper
public interface IRaffleActivityCountDao {
    RaffleActivityCount queryRaffleActivityCountByActivityCountId(Long activityCountId);

}
