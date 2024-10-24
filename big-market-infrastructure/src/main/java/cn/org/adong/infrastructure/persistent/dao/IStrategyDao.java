package cn.org.adong.infrastructure.persistent.dao;

import cn.org.adong.infrastructure.persistent.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jun
 * @version 1.0
 * @description: 抽奖策略 DAO
 * @date 2024/10/15
 */
@Mapper
public interface IStrategyDao {
    List<Strategy> queryStrategyList();

    Strategy queryStrategyByStrategyId(Long strategyId);
}
