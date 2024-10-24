package cn.org.adong.domain.strategy.repository;

import cn.org.adong.domain.strategy.model.entity.StrategyAwardEntity;
import cn.org.adong.domain.strategy.model.entity.StrategyEntity;
import cn.org.adong.domain.strategy.model.entity.StrategyRuleEntity;

import java.util.List;
import java.util.Map;

/**
 * @author Jun
 * @version 1.0
 * @description: 策略服务仓储接口
 * @date 2024/10/17
 */
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleModel);

}
