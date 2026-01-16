package com.zky.infrastructure.dao;

import cn.bugstack.middleware.db.router.annotation.DBRouterStrategy;
import com.zky.infrastructure.dao.po.UserCreditOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zky
 * @description 用户积分流水单 DAO
 * @create
 */
@Mapper
@DBRouterStrategy(splitTable = true)
public interface IUserCreditOrderDao {

    void insert(UserCreditOrder userCreditOrderReq);

}
