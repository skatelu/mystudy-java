/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testhttp.demo.sqlitetest.model.PromotionOutDO;

/**
 * @author wb-yjl790595
 * @version PromotionOutMapper.java, v 0.1 2020-08-04 12:09 wb-yjl790595 Exp $$
 */
@Repository
@Mapper
public interface PromotionOutMapper {

    /**
     * 功能描述 获取 外部活动表 所有数据
     * @author yjl
     * @date 2020/8/4
     * @param
     * @return {@link List<PromotionOutDO>}
     */
    List<PromotionOutDO> listPromotionOutDO();
}