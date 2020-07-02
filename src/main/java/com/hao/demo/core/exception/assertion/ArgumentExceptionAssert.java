package com.hao.demo.core.exception.assertion;

import com.hao.demo.core.constant.IResponseEnum;
import com.hao.demo.core.exception.ArgumentException;
import com.hao.demo.core.exception.BaseException;

import java.text.MessageFormat;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 16:51
 */
public interface ArgumentExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new ArgumentException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new ArgumentException(this, args, msg, t);
    }
}
