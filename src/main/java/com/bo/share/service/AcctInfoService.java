package com.bo.share.service;

import com.bo.share.entity.AcctInfo;

import java.util.List;

/**
 * (AcctInfo)表服务接口
 *
 * @author makejava
 * @since 2021-06-01 16:37:21
 */
public interface AcctInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param date 主键
     * @return 实例对象
     */
    AcctInfo queryById(String date);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AcctInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param acctInfo 实例对象
     * @return 实例对象
     */
    AcctInfo insert(AcctInfo acctInfo);

    /**
     * 修改数据
     *
     * @param acctInfo 实例对象
     * @return 实例对象
     */
    AcctInfo update(AcctInfo acctInfo);

    /**
     * 通过主键删除数据
     *
     * @param date 主键
     * @return 是否成功
     */
    boolean deleteById(String date);

}
