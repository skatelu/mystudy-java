/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testhttp.demo.sqlitetest.model.PromotionItemDO;

/**
 * @author wb-yjl790595
 * @version PromotionItemMapper.java, v 0.1 2020-08-03 17:13 wb-yjl790595 Exp $$
 */
@Repository
@Mapper
public interface PromotionItemMapper {

    /**
     * 功能描述 获取 商品(菜品)表 所有数据
     * @author yjl
     * @date 2020/8/3
     * @param
     * @return {@link List< PromotionItemDO>}
     */
    List<PromotionItemDO> listPromotionItemDO();

    /**
     * 功能描述 根据传入的活动ID列表进行查询
     *
     * @param params
     * @return {@link List< PromotionItemDO>}
     * @author yjl
     * @date 2020/8/4
     */
    List<PromotionItemDO> queryPromotionItemDO(Map<String, Object> params);


    List<PromotionItemDO> queryPromotionItemDOByPromotionId(List promotionIdList);

}