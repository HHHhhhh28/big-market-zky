package com.zky.domain.activity.model.entity;

import lombok.Data;

/**
 * @author zky
 * @description 参与抽奖活动实体对象
 * @create
 */
@Data
public class PartakeRaffleActivityEntity {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
