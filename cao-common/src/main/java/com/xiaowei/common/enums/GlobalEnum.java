package com.xiaowei.common.enums;

import lombok.Getter;

@Getter
public enum  GlobalEnum implements  BaseEnum {

    /**
     *  负数 为 异常
     *  0- 9999 为正确返回
     *  10000 -19999 为错误返回
     *
     */
    ERROE("-1", "异常"),
    SUCCESS("0","成功"),
    NO_LOGIN("88888","未登录,请先登录"),
    PARAMETER_EXCEPTION("10001", "参数不正确"),
    UNKNOW_EXECPTION("19999","未处理异常")
    ;


    GlobalEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    private String code;

    private String message;
}
