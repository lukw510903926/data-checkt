package com.mockuai.data.check.service.monitor;

/**
 * @author : yangqi
 * @email : lukewei@mockuai.com
 * @description :
 * @since : 2020/8/27 23:27
 */
public interface MonitorStrategy {

    /**
     * 监控告警
     *
     * @param object
     */
    void monitor(Object object);
}
