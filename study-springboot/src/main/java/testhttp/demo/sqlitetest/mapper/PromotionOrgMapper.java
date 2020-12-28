/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import testhttp.demo.sqlitetest.model.PromotionOrgDO;

/**
 * @author wb-yjl790595
 * @version PromotionOrgMapper.java, v 0.1 2020-08-03 17:13 wb-yjl790595 Exp $$
 */
@Repository
@Mapper
public interface PromotionOrgMapper {

    /**
     * 功能描述 获取 组织表 所有数据
     * @author yjl
     * @date 2020/8/3
     * @param
     * @return {@link List< PromotionOrgDO>}
     */
    List<PromotionOrgDO> listPromotionOrgDO();

    /**
     * 功能描述  根据传入的orgId,orgType 获取组织表信息
     *
     * @param orgId
     * @param orgType
     * @return {@link List< PromotionOrgDO>}
     * @author yjl
     * @date 2020/8/5
     */
    List<PromotionOrgDO> queryPromotionOrg(@Param("orgId") String orgId, @Param("orgType") String orgType);

}