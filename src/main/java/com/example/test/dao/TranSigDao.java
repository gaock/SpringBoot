package com.example.test.dao;

import com.example.test.bean.TranSig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TranSig)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 16:44:33
 */
public interface TranSigDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TranSig queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TranSig> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 查询指定行数据
     *
     * @param date  日期
     * @return 对象列表
     */
    List<TranSig> queryByDate(@Param("date") String date);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param tranSig 实例对象
     * @return 对象列表
     */
    List<TranSig> queryAll(TranSig tranSig);

    /**
     * 新增数据
     *
     * @param tranSig 实例对象
     * @return 影响行数
     */
    int insert(TranSig tranSig);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TranSig> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TranSig> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TranSig> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TranSig> entities);

    /**
     * 修改数据
     *
     * @param tranSig 实例对象
     * @return 影响行数
     */
    int update(TranSig tranSig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

