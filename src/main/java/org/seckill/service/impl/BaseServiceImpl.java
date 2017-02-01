package org.seckill.service.impl;
import com.github.pagehelper.PageHelper;
import org.seckill.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by piaomiao on 2017/2/1.
 * 通用mapper,包括基本的CURD操作
 *
 *
 */
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private Mapper<T> mapper;

    @Override
    public int save(T entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public T getById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> selectPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return mapper.selectAll();
    }
}
