package com.hao.demo.core.exception.assertion;


import com.hao.demo.core.constant.IResponseEnum;
import com.hao.demo.core.exception.BaseException;
import com.hao.demo.core.exception.BusinessException;

import java.text.MessageFormat;

/**
 * <p>业务异常断言</p>
 *
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 9:48
 */
public interface BusinessExceptionAssert extends IResponseEnum, Assert {

    @Override
    default BaseException newException(Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg);
    }

    @Override
    default BaseException newException(Throwable t, Object... args) {
        String msg = MessageFormat.format(this.getMessage(), args);

        return new BusinessException(this, args, msg, t);
    }

}
