package com.zky.domain.task.service;


import com.zky.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @author zky
 * @description 消息任务服务接口
 * @create
 */
public interface ITaskService {

    /**
     * 查询发送MQ失败和超时1分钟未发送的MQ
     *
     * @return 未发送的任务消息列表10条
     */
    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
