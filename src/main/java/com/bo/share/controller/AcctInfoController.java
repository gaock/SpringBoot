package com.bo.share.controller;

import com.bo.share.entity.AcctInfo;
import com.bo.share.service.AcctInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (AcctInfo)表控制层
 *
 * @author makejava
 * @since 2021-06-01 16:37:23
 */
@RestController
@RequestMapping("acctInfo")
public class AcctInfoController {
    /**
     * 服务对象
     */
    @Resource
    private AcctInfoService acctInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AcctInfo selectOne(String id) {
        return this.acctInfoService.queryById(id);
    }

}
