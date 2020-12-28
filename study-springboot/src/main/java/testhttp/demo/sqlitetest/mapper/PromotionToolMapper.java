/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testhttp.demo.sqlitetest.model.PromotionToolDO;

/**
 * @author wb-yjl790595
 * @version PromotionToolMapper.java, v 0.1 2020-08-03 17:13 wb-yjl790595 Exp $$
 */
@Repository
@Mapper
public interface PromotionToolMapper {

    /**
     * 功能描述 获取 优惠工具 所有数据
     * @author yjl
     * @date 2020/8/3
     * @param
     * @return {@link List< PromotionToolDO>}
     */
    List<PromotionToolDO> listPromotionToolDO();

    /**
     * 功能描述  根据传入的ToolCode 获取工具表信息
     *
     * @param toolCode
     * @return {@link List< PromotionToolDO>}
     * @author yjl
     * @date 2020/8/6
     */
    List<PromotionToolDO> queryPromotionToolDOByToolCode(List<String> toolCode);

}