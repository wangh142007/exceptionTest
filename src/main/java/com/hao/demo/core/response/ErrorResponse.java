package com.hao.demo.core.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>错误返回结果</p>
 *
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 10:36
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class ErrorResponse {

    private Integer code;
    private String msg;


    public ErrorResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
