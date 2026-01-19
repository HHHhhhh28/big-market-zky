package com.zky.trigger.api;


import com.zky.trigger.api.dto.ESUserRaffleOrderResponseDTO;
import com.zky.trigger.api.response.Response;

import java.util.List;

/**
 * @author zky
 * @description ERP 运营接口
 * @create
 */
public interface IErpOperateService {

    Response<List<ESUserRaffleOrderResponseDTO>> queryUserRaffleOrder();

}
