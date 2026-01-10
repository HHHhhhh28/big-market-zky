package com.zky.domain.credit.repository;


import com.zky.domain.credit.model.aggregate.TradeAggregate;

/**
 * @author zky
 * @description 用户积分仓储
 * @create
 */
public interface ICreditRepository {

    void saveUserCreditTradeOrder(TradeAggregate tradeAggregate);

}
