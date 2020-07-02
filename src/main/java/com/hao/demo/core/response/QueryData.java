package com.hao.demo.core.response;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 17:04
 */
@Data
public class QueryData<T> {
    /**
     * 数据列表
     */
    private List<T> records;
    /**
     * 总记录数
     */
    private long totalCount;
    /**
     * 当前页，从1开始
     */
    private long pageNo;
    /**
     * 分页大小
     */
    private long pageSize;

    public QueryData() {

    }

    public QueryData(IPage<T> page) {

        this.setRecords(page.getRecords());
        this.setPageNo(page.getCurrent());
        this.setPageSize(page.getSize());
        this.setTotalCount(page.getTotal());
    }

    public <E> QueryData(IPage<E> page, Function<E, T> mapper) {

        this.setPageNo(page.getCurrent());
        this.setPageSize(page.getSize());
        this.setTotalCount(page.getTotal());

        if (CollUtil.isEmpty(page.getRecords())) {
            this.setRecords(Collections.emptyList());
        } else {
            this.setRecords(page.getRecords().stream().map(mapper).collect(Collectors.toList()));
        }

    }

    public QueryData(List<T> records, long totalCount, int pageNo, int pageSize) {
        this.records = records;
        this.totalCount = totalCount;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public <E> QueryData(IPage<E> page, List<T> records) {
        this.records = records;
        this.setPageNo(page.getCurrent());
        this.setPageSize(page.getSize());
        this.setTotalCount(page.getTotal());
    }
}
