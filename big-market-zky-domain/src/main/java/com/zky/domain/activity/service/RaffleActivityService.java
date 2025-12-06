package com.zky.domain.activity.service;

import com.zky.domain.activity.repository.IActivityRepository;
import org.springframework.stereotype.Service;

/**
 * @author zky
 * @description 抽奖活动服务
 * @create
 */
@Service
public class RaffleActivityService extends AbstractRaffleActivity {

    public RaffleActivityService(IActivityRepository activityRepository) {
        super(activityRepository);
    }

}
