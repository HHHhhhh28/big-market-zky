package com.zky.domain.task.repository;


import com.zky.domain.task.model.entity.TaskEntity;

import java.util.List;

/**
 * @author zky
 * @description 任务服务仓储接口
 * @create
 */
public interface ITaskRepository {

    List<TaskEntity> queryNoSendMessageTaskList();

    void sendMessage(TaskEntity taskEntity);

    void updateTaskSendMessageCompleted(String userId, String messageId);

    void updateTaskSendMessageFail(String userId, String messageId);

}
