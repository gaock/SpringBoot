package com.example.test.bean.service.impl;

import com.example.test.bean.entity.TranSig;
import com.example.test.bean.dao.TranSigDao;
import com.example.test.bean.service.TranSigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TranSig)表服务实现类
 *
 * @author makejava
 * @since 2021-05-18 17:58:14
 */
@Service("tranSigService")
public class TranSigServiceImpl implements TranSigService {
    @Resource
    private TranSigDao tranSigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TranSig queryById(Integer id) {
        return this.tranSigDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TranSig> queryAllByLimit(int offset, int limit) {
        return this.tranSigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tranSig 实例对象
     * @return 实例对象
     */
    @Override
    public TranSig insert(TranSig tranSig) {
        this.tranSigDao.insert(tranSig);
        return tranSig;
    }

    /**
     * 修改数据
     *
     * @param tranSig 实例对象
     * @return 实例对象
     */
    @Override
    public TranSig update(TranSig tranSig) {
        this.tranSigDao.update(tranSig);
        return this.queryById(tranSig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tranSigDao.deleteById(id) > 0;
    }
}
