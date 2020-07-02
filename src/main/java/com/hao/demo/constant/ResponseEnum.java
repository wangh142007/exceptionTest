package com.hao.demo.constant;

import com.hao.demo.core.exception.assertion.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 10:05
 */
@Getter
@AllArgsConstructor
public enum ResponseEnum implements BusinessExceptionAssert {

    /**
     * Bad Stu type
     */
    BAD_LICENCE_TYPE(7001, "Bad Stu type."),
    /**
     * Stu not found
     */
    LICENCE_NOT_FOUND(7002, "Stu not found.");

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;
}
