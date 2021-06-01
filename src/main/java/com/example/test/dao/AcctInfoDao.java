package com.example.test.dao;

import com.example.test.bean.AcctInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (AcctInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-05-18 17:58:07
 */
public interface AcctInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param date 主键
     * @return 实例对象
     */
    AcctInfo queryById(String date);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<AcctInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param acctInfo 实例对象
     * @return 对象列表
     */
    List<AcctInfo> queryAll(AcctInfo acctInfo);

    /**
     * 新增数据
     *
     * @param acctInfo 实例对象
     * @return 影响行数
     */
    int insert(AcctInfo acctInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<AcctInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<AcctInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<AcctInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<AcctInfo> entities);

    /**
     * 修改数据
     *
     * @param acctInfo 实例对象
     * @return 影响行数
     */
    int update(AcctInfo acctInfo);

    /**
     * 通过主键删除数据
     *
     * @param date 主键
     * @return 影响行数
     */
    int deleteById(String date);

}

