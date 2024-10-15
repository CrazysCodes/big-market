package cn.org.adong.infrastructure.persistent.dao;

import cn.org.adong.infrastructure.persistent.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Jun
 * @version 1.0
 * @description: 奖品表DAO
 * @date 2024/10/15
 */
@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();
}
