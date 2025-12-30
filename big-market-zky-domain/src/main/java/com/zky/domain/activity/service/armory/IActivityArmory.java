package com.zky.domain.activity.service.armory;

/**
 * @author zky
 * @description 活动装配预热
 * @create
 */
public interface IActivityArmory {

    boolean assembleActivitySkuByActivityId(Long activityId);

    boolean assembleActivitySku(Long sku);

}
