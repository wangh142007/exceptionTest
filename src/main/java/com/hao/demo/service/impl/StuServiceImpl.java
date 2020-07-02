package com.hao.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hao.demo.constant.ResponseEnum;
import com.hao.demo.domain.Stu;
import com.hao.demo.mapper.StuMapper;
import com.hao.demo.service.IStuService;
import org.springframework.stereotype.Service;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 17:18
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper, Stu> implements IStuService {

    @Override
    public Stu queryDetail(Integer id) {
        Stu stu = this.baseMapper.selectById(id);
        //校验非空
        ResponseEnum.LICENCE_NOT_FOUND.assertNotNull(stu);
        return stu;
    }
}
