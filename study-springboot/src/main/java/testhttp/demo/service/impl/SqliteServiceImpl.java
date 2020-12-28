/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testhttp.demo.service.SqliteService;
import testhttp.demo.sqlitetest.mapper.*;
import testhttp.demo.sqlitetest.model.*;

/**
 * @author wb-yjl790595
 * @version SqliteServiceImpl.java, v 0.1 2020-07-30 20:05 wb-yjl790595 Exp $$
 */
@Service
public class SqliteServiceImpl implements SqliteService {

    private static AtomicInteger a = new AtomicInteger();

    @Autowired
    PromotionBaseMapper promotionBaseMapper;
    @Autowired
    PromotionBenefitMapper benefitMapper;
    @Autowired
    PromotionItemMapper itemMapper;
    @Autowired
    PromotionOrgMapper orgMapper;
    @Autowired
    PromotionToolMapper toolMapper;
    @Autowired
    PromotionOutMapper outMapper;

    @Override
    public Map<String, List> selectAll() {

        HashMap<String, List> resultMap = new HashMap<>();

        List<PromotionBaseDO> promotionBaseDOS = promotionBaseMapper.listPromotionBaseDO();

        List<PromotionBenefitDO> promotionBenefitDOS = benefitMapper.listPromotionBenefitDO();

        List<PromotionItemDO> promotionItemDOS = itemMapper.listPromotionItemDO();

        List<PromotionOrgDO> promotionOrgDOS = orgMapper.listPromotionOrgDO();

        List<PromotionToolDO> promotionToolDOS = toolMapper.listPromotionToolDO();

        List<PromotionOutDO> promotionOutDOS = outMapper.listPromotionOutDO();
//        String promotionBaseDOSJSON = JSON.toJSONString(promotionBaseDOS);
//
//        String promotionBenefitDOSJSON = JSON.toJSONString(promotionBenefitDOS);
//
//        String promotionItemDOSJSON = JSON.toJSONString(promotionItemDOS);
//
//        String promotionOrgDOSJSON = JSON.toJSONString(promotionOrgDOS);
//
//        String promotionToolDOSJSON = JSON.toJSONString(promotionToolDOS);

        resultMap.put("promotionBaseDOS", promotionBaseDOS);
        resultMap.put("promotionBenefitDOS", promotionBenefitDOS);
        resultMap.put("promotionItemDOS",promotionItemDOS);
        resultMap.put("promotionOrgDOS", promotionOrgDOS);
        resultMap.put("promotionToolDOS", promotionToolDOS);
        resultMap.put("promotionOutDOS", promotionOutDOS);

        return resultMap;
    }

    @Override
    public Map<String, List> querySqliteDO() {

        Map<String, List> resultMap = new ConcurrentHashMap<>();

        List<String> promotionIds = new ArrayList<>();
        promotionIds.add("121831000000074005");
        promotionIds.add("121839600000058205");
        List<PromotionBaseDO> promotionBaseDOS = promotionBaseMapper.queryPromotionBaseDOByPromotionId(promotionIds);
        List<PromotionBaseDO> promotionBaseDOList = promotionBaseMapper.listPromotionBaseDO();
        List<String> promotionToolCodeList = promotionBaseDOList.stream()
                .map(PromotionBaseDO::getPromotionToolCode)
                .distinct()
                .collect(Collectors.toList());

        List<PromotionBenefitDO> promotionBenefitDOS = benefitMapper.queryPromotionBenefitDOByPromotionId(promotionIds);
        List<PromotionItemDO> promotionItemDOS = itemMapper.queryPromotionItemDOByPromotionId(promotionIds);
        List<PromotionOrgDO> promotionOrgDOS = orgMapper.queryPromotionOrg("3724849701", "SHOP");
        List<PromotionToolDO> promotionToolDOS = toolMapper.queryPromotionToolDOByToolCode(promotionToolCodeList);

        resultMap.put("promotionBaseDOS", promotionBaseDOS);
        resultMap.put("promotionBenefitDOS", promotionBenefitDOS);
        resultMap.put("promotionItemDOS", promotionItemDOS);
        resultMap.put("promotionOrgDOS", promotionOrgDOS);
        resultMap.put("promotionToolDOS", promotionToolDOS);

        List<AtomicInteger> result = new ArrayList<>();
        a.getAndIncrement();
        result.add(a);
        resultMap.put("promotionCount", result);

        return resultMap;
    }


}