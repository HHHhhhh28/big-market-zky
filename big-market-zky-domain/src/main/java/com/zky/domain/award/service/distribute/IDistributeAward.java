package com.zky.domain.award.service.distribute;


import com.zky.domain.award.model.entity.DistributeAwardEntity;

/**
 * @author zky
 * @description 分发奖品接口
 * @create
 */
public interface IDistributeAward {

    void giveOutPrizes(DistributeAwardEntity distributeAwardEntity);

}
