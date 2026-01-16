package com.zky.infrastructure.dao;

import com.zky.infrastructure.dao.po.RuleTreeNodeLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zky
 * @description 规则树节点连线表DAO
 * @create
 */
@Mapper
public interface IRuleTreeNodeLineDao {

    List<RuleTreeNodeLine> queryRuleTreeNodeLineListByTreeId(String treeId);

}
