package com.zky.domain.activity.model.valobj;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zky
 * @description 活动状态值对象
 * @create
 */
@Getter
@AllArgsConstructor
public enum ActivityStateVO {

    create("create", "创建"),
    open("open", "开启"),
    close("close", "关闭"),
    ;

    private final String code;
    private final String desc;

}
