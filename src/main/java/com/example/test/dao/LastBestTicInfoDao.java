package com.example.test.dao;

import com.example.test.bean.LastBestTicInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (LastBestTicInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-01 16:44:32
 */
public interface LastBestTicInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    LastBestTicInfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LastBestTicInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 查询指定行数据
     *
     * @param limit  查询条数
     * @return 对象列表
     */
    List<LastBestTicInfo> queryLastBest(@Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param lastBestTicInfo 实例对象
     * @return 对象列表
     */
    List<LastBestTicInfo> queryAll(LastBestTicInfo lastBestTicInfo);

    /**
     * 新增数据
     *
     * @param lastBestTicInfo 实例对象
     * @return 影响行数
     */
    int insert(LastBestTicInfo lastBestTicInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<LastBestTicInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<LastBestTicInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<LastBestTicInfo> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<LastBestTicInfo> entities);

    /**
     * 修改数据
     *
     * @param lastBestTicInfo 实例对象
     * @return 影响行数
     */
    int update(LastBestTicInfo lastBestTicInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

