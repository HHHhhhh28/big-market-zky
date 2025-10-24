package com.zky.infrastructure.persistent.dao;

import com.zky.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zky
 * @description 奖品表DAO
 * @create
 */
@Mapper
public interface IAwardDao {

    List<Award> queryAwardList();

}
