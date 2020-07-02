package com.hao.demo.core.response;

/**
 * 通用返回结果，同{@link CommonResponse}
 *
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 17:05
 */
public class R<T> extends CommonResponse<T> {

    public R() {
        super();
    }

    public R(T data) {
        super();
        this.data = data;
    }

    public R(T data, String msg) {
        super();
        this.data = data;
        this.message = msg;
    }

    public R(Throwable e) {
        super();
        this.message = e.getMessage();
        this.code = -1;
    }
}
