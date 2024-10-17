package cn.org.adong.infrastructure.persistent.dao;

import cn.org.adong.infrastructure.persistent.po.StrategyAward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jun
 * @version 1.0
 * @description: 抽奖策略奖品明细配置 - 概率、规则 DAO
 * @date 2024/10/15
 */
@Mapper
public interface IStrategyAwardDao {
    List<StrategyAward> queryStrategyAwardList();

    List<StrategyAward> queryStrategyAwardListByStrategyId(Long strategyId);
}
