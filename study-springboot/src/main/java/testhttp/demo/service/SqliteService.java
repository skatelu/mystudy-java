/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.service;

import java.util.List;
import java.util.Map;

/**
 * @author wb-yjl790595
 * @version SqliteService.java, v 0.1 2020-07-30 20:04 wb-yjl790595 Exp $$
 */

public interface SqliteService {
    Map<String, List> selectAll();

    Map<String, List> querySqliteDO();
}