package com.example.test.controller;

import com.example.test.bean.LastBestTicInfo;
import com.example.test.service.LastBestTicInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (LastBestTicInfo)表控制层
 *
 * @author makejava
 * @since 2021-06-01 16:44:33
 */
@RestController
@RequestMapping("lastBestTicInfo")
public class LastBestTicInfoController {
    /**
     * 服务对象
     */
    @Resource
    private LastBestTicInfoService lastBestTicInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public LastBestTicInfo selectOne(Integer id) {
        return this.lastBestTicInfoService.queryById(id);
    }

}
