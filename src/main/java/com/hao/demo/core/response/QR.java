package com.hao.demo.core.response;

/**
 * 响应信息主体，同{@link QueryDataResponse}
 *
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 17:03
 */
public class QR<T> extends QueryDataResponse<T> {

    public QR() {
        super();
    }

    public QR(QueryData<T> data) {
        super(data);
    }
}