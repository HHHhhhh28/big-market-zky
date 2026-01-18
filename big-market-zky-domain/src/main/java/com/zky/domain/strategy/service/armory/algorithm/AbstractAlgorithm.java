package com.zky.domain.strategy.service.armory.algorithm;

import com.zky.domain.strategy.repository.IStrategyRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;
import java.security.SecureRandom;

/**
 * @author zky
 * @description 抽奖算法抽象类
 * @create
 */
public abstract class AbstractAlgorithm implements IAlgorithm {

    @Resource
    protected IStrategyRepository repository;

    protected final SecureRandom secureRandom = new SecureRandom();

    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public enum Algorithm {
        O1("o1Algorithm"), OLogN("oLogNAlgorithm");

        private String key;
    }

}
