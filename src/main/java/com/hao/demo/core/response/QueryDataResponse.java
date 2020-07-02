package com.hao.demo.core.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>查询数据集返回结果</p>
 *
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 17:04
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QueryDataResponse<T> extends CommonResponse<QueryData<T>> {
    public QueryDataResponse() {
    }

    public QueryDataResponse(QueryData<T> data) {
        super(data);
    }
}