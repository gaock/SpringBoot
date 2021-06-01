package com.example.test.serviceImpl;

import com.example.test.bean.EarnInfo;
import com.example.test.dao.EarnInfoDao;
import com.example.test.service.EarnInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (EarnInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-05-18 17:58:13
 */
@Service("earnInfoService")
public class EarnInfoServiceImpl implements EarnInfoService {
    @Resource
    private EarnInfoDao earnInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param date 主键
     * @return 实例对象
     */
    @Override
    public EarnInfo queryById(String date) {
        return this.earnInfoDao.queryById(date);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<EarnInfo> queryAllByLimit(int offset, int limit) {
        return this.earnInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param earnInfo 实例对象
     * @return 实例对象
     */
    @Override
    public EarnInfo insert(EarnInfo earnInfo) {
        this.earnInfoDao.insert(earnInfo);
        return earnInfo;
    }

    /**
     * 修改数据
     *
     * @param earnInfo 实例对象
     * @return 实例对象
     */
    @Override
    public EarnInfo update(EarnInfo earnInfo) {
        this.earnInfoDao.update(earnInfo);
        return this.queryById(earnInfo.getDate());
    }

    /**
     * 通过主键删除数据
     *
     * @param date 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String date) {
        return this.earnInfoDao.deleteById(date) > 0;
    }
}
