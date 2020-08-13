package com.mockuai.data.check.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : yangqi
 * @email : lukewei@mockuai.com
 * @description :
 * @since : 2020-08-13 20:25
 */
public class DataCheckStrategyHolder {

    private DataCheckStrategyHolder() {
    }

    private static final Map<String, DataCheckStrategy> CHECK_STRATEGY_MAP = new ConcurrentHashMap<>();
}
