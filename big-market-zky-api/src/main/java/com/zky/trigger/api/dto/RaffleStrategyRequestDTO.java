package com.zky.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zky
 * @description 抽奖请求参数
 * @create
 */
@Data
public class RaffleStrategyRequestDTO implements Serializable {

    // 抽奖策略ID
    private Long strategyId;

}
