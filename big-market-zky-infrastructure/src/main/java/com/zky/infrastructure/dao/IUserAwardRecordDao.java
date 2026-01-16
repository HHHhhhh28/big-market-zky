package com.zky.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import com.zky.infrastructure.dao.po.UserAwardRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zky
 * @description 用户中奖记录表
 * @create
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserAwardRecordDao {

    void insert(UserAwardRecord userAwardRecord);

    int updateAwardRecordCompletedState(UserAwardRecord userAwardRecordReq);

}