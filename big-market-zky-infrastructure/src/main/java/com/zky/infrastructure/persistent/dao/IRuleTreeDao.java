package com.zky.infrastructure.persistent.dao;

import com.zky.infrastructure.persistent.po.RuleTree;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zky
 * @description 规则树表DAO
 * @create
 */
@Mapper
public interface IRuleTreeDao {

    RuleTree queryRuleTreeByTreeId(String treeId);

}
