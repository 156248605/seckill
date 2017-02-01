package org.seckill.service;

/**
 * Created by piaomiao on 2017/2/1.
 */
public interface BaseService<T> {
    int save(T entity);

    int deleteById(Integer id);

    int update(T entity);

    T getById(Integer id);

}
