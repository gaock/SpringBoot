package com.example.test.bean.controller;

import com.example.test.bean.entity.TranSig;
import com.example.test.bean.service.TranSigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TranSig)表控制层
 *
 * @author makejava
 * @since 2021-05-18 17:58:14
 */
@RestController
@RequestMapping("tranSig")
public class TranSigController {
    /**
     * 服务对象
     */
    @Resource
    private TranSigService tranSigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TranSig selectOne(Integer id) {
        return this.tranSigService.queryById(id);
    }

}
