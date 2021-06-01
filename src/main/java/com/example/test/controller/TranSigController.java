package com.example.test.controller;

import com.example.test.bean.TranSig;
import com.example.test.service.TranSigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TranSig)表控制层
 *
 * @author makejava
 * @since 2021-06-01 16:44:34
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
