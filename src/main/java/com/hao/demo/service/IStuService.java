package com.hao.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hao.demo.domain.Stu;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 17:17
 */
public interface IStuService extends IService<Stu> {

    Stu queryDetail(Integer id);

}
