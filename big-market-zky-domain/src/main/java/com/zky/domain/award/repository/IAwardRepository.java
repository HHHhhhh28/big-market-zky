package com.zky.domain.award.repository;


import com.zky.domain.award.model.aggregate.GiveOutPrizesAggregate;
import com.zky.domain.award.model.aggregate.UserAwardRecordAggregate;

/**
 * @author zky
 * @description 奖品仓储服务
 * @create
 */
public interface IAwardRepository {

    void saveUserAwardRecord(UserAwardRecordAggregate userAwardRecordAggregate);

    String queryAwardConfig(Integer awardId);

    void saveGiveOutPrizesAggregate(GiveOutPrizesAggregate giveOutPrizesAggregate);

    String queryAwardKey(Integer awardId);

}
