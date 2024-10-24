package cn.org.adong.domain.strategy.service.armory;

/**
 * @author Jun
 * @version 1.0
 * @description: 策略抽奖调度
 * @date 2024/10/24
 */
public interface IStrategyDispatch {

    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

    Integer getRandomAwardId(Long strategyId, String ruleWeightValue);

}
