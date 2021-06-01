package com.example.test.controller;

import com.example.test.bean.EarnInfo;
import com.example.test.service.EarnInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (EarnInfo)表控制层
 *
 * @author makejava
 * @since 2021-06-01 16:44:32
 */
@RestController
@RequestMapping("earnInfo")
public class EarnInfoController {
    /**
     * 服务对象
     */
    @Resource
    private EarnInfoService earnInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public EarnInfo selectOne(String id) {
        return this.earnInfoService.queryById(id);
    }

}
