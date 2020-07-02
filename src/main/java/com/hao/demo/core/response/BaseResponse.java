package com.hao.demo.core.response;

import com.hao.demo.core.constant.enums.CommonResponseEnum;
import com.hao.demo.core.constant.IResponseEnum;
import lombok.Data;

/**
 * <p>基础返回结果</p>
 *
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 11:30
 */
@Data
public class BaseResponse {
    /**
     * 返回码
     */
    protected int code;
    /**
     * 返回消息
     */
    protected String message;

    public BaseResponse() {
        // 默认创建成功的回应
        this(CommonResponseEnum.SUCCESS);
    }

    public BaseResponse(IResponseEnum responseEnum) {
        this(responseEnum.getCode(), responseEnum.getMessage());
    }

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
