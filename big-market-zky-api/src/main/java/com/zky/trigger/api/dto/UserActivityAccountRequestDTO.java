package com.zky.trigger.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zky
 * @description 用户活动账户请求对象
 * @create
 */
@Data
public class UserActivityAccountRequestDTO implements Serializable {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 活动ID
     */
    private Long activityId;

}
