package cn.org.adong.infrastructure.persistent.po;

import lombok.Data;

import java.util.Date;

/**
 * @author Jun
 * @version 1.0
 * @description: 抽奖策略
 * @date 2024/10/15
 */
@Data
public class Strategy {

    /** 自增ID */
    private Long id;
    /** 抽奖策略ID */
    private Long strategyId;
    /** 抽奖策略描述 */
    private String strategyDesc;
    /** 创建时间 */
    private Date createTime;
    /** 更新时间 */
    private Date updateTime;

}
