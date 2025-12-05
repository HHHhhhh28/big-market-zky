package com.zky.infrastructure.persistent.dao;

import com.zky.infrastructure.persistent.po.RaffleActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zky
 * @description 抽奖活动表Dao
 * @create
 */
@Mapper
public interface IRaffleActivityDao {

    RaffleActivity queryRaffleActivityByActivityId(Long activityId);

}
