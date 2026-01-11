package com.zky.domain.activity.service.quota.policy;


import com.zky.domain.activity.model.aggregate.CreateQuotaOrderAggregate;

/**
 * @author zky
 * @description 交易策略接口，包括；返利兑换（不用支付），积分订单（需要支付）
 * @create
 */
public interface ITradePolicy {

    void trade(CreateQuotaOrderAggregate createQuotaOrderAggregate);

}
