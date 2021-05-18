package com.example.test.bean.service;

import com.example.test.bean.entity.LastBestTicInfo;

import java.util.List;

/**
 * (LastBestTicInfo)表服务接口
 *
 * @author makejava
 * @since 2021-05-18 17:58:13
 */
public interface LastBestTicInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LastBestTicInfo queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LastBestTicInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param lastBestTicInfo 实例对象
     * @return 实例对象
     */
    LastBestTicInfo insert(LastBestTicInfo lastBestTicInfo);

    /**
     * 修改数据
     *
     * @param lastBestTicInfo 实例对象
     * @return 实例对象
     */
    LastBestTicInfo update(LastBestTicInfo lastBestTicInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
