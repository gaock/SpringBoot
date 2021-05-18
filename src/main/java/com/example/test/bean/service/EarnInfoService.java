package com.example.test.bean.service;

import com.example.test.bean.entity.EarnInfo;

import java.util.List;

/**
 * (EarnInfo)表服务接口
 *
 * @author makejava
 * @since 2021-05-18 17:58:13
 */
public interface EarnInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param date 主键
     * @return 实例对象
     */
    EarnInfo queryById(String date);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<EarnInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param earnInfo 实例对象
     * @return 实例对象
     */
    EarnInfo insert(EarnInfo earnInfo);

    /**
     * 修改数据
     *
     * @param earnInfo 实例对象
     * @return 实例对象
     */
    EarnInfo update(EarnInfo earnInfo);

    /**
     * 通过主键删除数据
     *
     * @param date 主键
     * @return 是否成功
     */
    boolean deleteById(String date);

}
