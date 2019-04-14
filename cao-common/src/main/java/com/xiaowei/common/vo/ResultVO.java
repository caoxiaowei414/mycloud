package com.xiaowei.common.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回数据
 */
@Data //  lombok get set toString
@JsonInclude(JsonInclude.Include.NON_NULL) // null 或者 空值 不返回
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 3236329195874147801L;
    /** 错误码. */
    private String code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
