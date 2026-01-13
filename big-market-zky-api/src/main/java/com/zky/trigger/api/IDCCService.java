package com.zky.trigger.api;


import com.zky.trigger.api.response.Response;

/**
 * @author zky
 * @description DCC 动态配置中心
 * @create
 */
public interface IDCCService {

    Response<Boolean> updateConfig(String key, String value);

}
