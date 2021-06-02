package com.example.test.service;

import com.example.test.bean.TranSig;

import java.util.List;

/**
 * (TranSig)表服务接口
 *
 * @author makejava
 * @since 2021-06-01 16:44:33
 */
public interface TranSigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TranSig queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TranSig> queryAllByLimit(int offset, int limit);

    /**
     * 查询多条数据
     *
     * @param date  查询日期
     * @return 对象列表
     */
    List<TranSig> queryByDate(String date);

    /**
     * 新增数据
     *
     * @param tranSig 实例对象
     * @return 实例对象
     */
    TranSig insert(TranSig tranSig);

    /**
     * 修改数据
     *
     * @param tranSig 实例对象
     * @return 实例对象
     */
    TranSig update(TranSig tranSig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
