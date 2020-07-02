package com.hao.demo.controller;

import com.hao.demo.core.response.R;
import com.hao.demo.domain.Stu;
import com.hao.demo.service.IStuService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 17:23
 */
@RestController
@RequestMapping("/stu")
@CrossOrigin(origins = "*", allowCredentials = "true")
public class StuController {

    @Autowired
    private IStuService stuService;

    @GetMapping(value = "/{id}")
    public R<Stu> getLicence(@PathVariable("id") Integer id) {
        return new R<>(stuService.queryDetail(id));
    }

}
