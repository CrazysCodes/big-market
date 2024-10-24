package cn.org.adong.domain.strategy.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jun
 * @version 1.0
 * @description: 策略结果实体
 * @date 2024/10/17
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AwardEntity {
    /** 用户ID */
    private String userId;
    /** 奖品ID */
    private Integer awardId;
}
