package com.zky.domain.award.model.aggregate;

import com.zky.domain.award.model.entity.TaskEntity;
import com.zky.domain.award.model.entity.UserAwardRecordEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zky
 * @description 用户中奖记录聚合对象 【聚合代表一个事务操作】
 * @create
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAwardRecordAggregate {

    private UserAwardRecordEntity userAwardRecordEntity;

    private TaskEntity taskEntity;

}
