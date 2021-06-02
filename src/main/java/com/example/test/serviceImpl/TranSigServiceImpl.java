package com.example.test.serviceImpl;

import com.example.test.bean.TranSig;
import com.example.test.dao.TranSigDao;
import com.example.test.service.TranSigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TranSig)表服务实现类
 *
 * @author makejava
 * @since 2021-06-01 16:44:33
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
     * 查询多条数据
     *
     * @param date  查询日期
     * @return 对象列表
     */
    @Override
    public List<TranSig> queryByDate(String date) {
        return this.tranSigDao.queryByDate(date);
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
