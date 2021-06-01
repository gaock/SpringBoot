package com.example.test.serviceImpl;

import com.example.test.bean.LastBestTicInfo;
import com.example.test.dao.LastBestTicInfoDao;
import com.example.test.service.LastBestTicInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (LastBestTicInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-05-18 17:58:13
 */
@Service("lastBestTicInfoService")
public class LastBestTicInfoServiceImpl implements LastBestTicInfoService {
    @Resource
    private LastBestTicInfoDao lastBestTicInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public LastBestTicInfo queryById(Integer id) {
        return this.lastBestTicInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<LastBestTicInfo> queryAllByLimit(int offset, int limit) {
        return this.lastBestTicInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param lastBestTicInfo 实例对象
     * @return 实例对象
     */
    @Override
    public LastBestTicInfo insert(LastBestTicInfo lastBestTicInfo) {
        this.lastBestTicInfoDao.insert(lastBestTicInfo);
        return lastBestTicInfo;
    }

    /**
     * 修改数据
     *
     * @param lastBestTicInfo 实例对象
     * @return 实例对象
     */
    @Override
    public LastBestTicInfo update(LastBestTicInfo lastBestTicInfo) {
        this.lastBestTicInfoDao.update(lastBestTicInfo);
        return this.queryById(lastBestTicInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.lastBestTicInfoDao.deleteById(id) > 0;
    }
}
