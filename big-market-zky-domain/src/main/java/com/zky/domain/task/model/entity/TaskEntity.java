package com.zky.domain.task.model.entity;

import lombok.Data;

/**
 * @author zky
 * @description 任务实体对象
 * @create
 */
@Data
public class TaskEntity {

    /** 活动ID */
    private String userId;
    /** 消息主题 */
    private String topic;
    /** 消息编号 */
    private String messageId;
    /** 消息主体 */
    private String message;

}
