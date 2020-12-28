/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import testhttp.demo.sqlitetest.model.PromotionBenefitDO;

/**
 * @author wb-yjl790595
 * @version PromotionBenefitMapper.java, v 0.1 2020-08-03 17:12 wb-yjl790595 Exp $$
 */
@Repository
@Mapper
public interface PromotionBenefitMapper {

    /**
     * 获取权益表所有数据
     * @author yjl
     * @date 2020/8/3
     * @param
     * @return {@link List< PromotionBenefitDO>}
     */
    List<PromotionBenefitDO> listPromotionBenefitDO();

    /**
     * 功能描述 根据传入的活动ID列表进行查询
     *
     * @param promotionIds
     * @return {@link List< PromotionBenefitDO>}
     * @author yjl
     * @date 2020/8/4
     */
    List<PromotionBenefitDO> queryPromotionBenefitDOByPromotionId(List<String> promotionIds);

}