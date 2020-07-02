package com.hao.demo.core.exception;

import com.hao.demo.core.constant.IResponseEnum;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 9:46
 */
public class BusinessException extends BaseException {

    private static final long serialVersionUID = 1L;

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message) {
        super(responseEnum, args, message);
    }

    public BusinessException(IResponseEnum responseEnum, Object[] args, String message, Throwable cause) {
        super(responseEnum, args, message, cause);
    }

}
