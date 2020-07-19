package com.peng.domain.result;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author peng
 * @Date 2020/7/18 19:40
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 消息
     */
    private String message;

    /**
     * 返回对象
     */
    private T data;

}
