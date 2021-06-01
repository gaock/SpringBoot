package com.bo.share.service.impl;

import com.bo.share.entity.AcctInfo;
import com.bo.share.dao.AcctInfoDao;
import com.bo.share.service.AcctInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AcctInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 16:37:22
 */
@Service("acctInfoService")
public class AcctInfoServiceImpl implements AcctInfoService {
    @Resource
    private AcctInfoDao acctInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param date 主键
     * @return 实例对象
     */
    @Override
    public AcctInfo queryById(String date) {
        return this.acctInfoDao.queryById(date);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<AcctInfo> queryAllByLimit(int offset, int limit) {
        return this.acctInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param acctInfo 实例对象
     * @return 实例对象
     */
    @Override
    public AcctInfo insert(AcctInfo acctInfo) {
        this.acctInfoDao.insert(acctInfo);
        return acctInfo;
    }

    /**
     * 修改数据
     *
     * @param acctInfo 实例对象
     * @return 实例对象
     */
    @Override
    public AcctInfo update(AcctInfo acctInfo) {
        this.acctInfoDao.update(acctInfo);
        return this.queryById(acctInfo.getDate());
    }

    /**
     * 通过主键删除数据
     *
     * @param date 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String date) {
        return this.acctInfoDao.deleteById(date) > 0;
    }
}
