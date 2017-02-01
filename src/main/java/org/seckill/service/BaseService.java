package org.seckill.service;

import java.util.List;

/**
 * Created by piaomiao on 2017/2/1.
 */
public interface BaseService<T> {
    int save(T entity);

    int deleteById(Integer id);

    int update(T entity);

    T getById(Integer id);

    List<T> selectPage(int pageNum,int pageSize);

}
