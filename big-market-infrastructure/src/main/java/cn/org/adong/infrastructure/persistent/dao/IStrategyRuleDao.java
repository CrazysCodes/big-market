package cn.org.adong.infrastructure.persistent.dao;

import cn.org.adong.infrastructure.persistent.po.StrategyRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jun
 * @version 1.0
 * @description: 策略规则 Dao
 * @date 2024/10/15
 */
@Mapper
public interface IStrategyRuleDao {
    List<StrategyRule> queryStrategyRuleList();
}
