package org.seckill.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

import  org.seckill.entity.Seckill;

/**
 * Created by piaomiao on 2017/1/2.
 */
public interface SeckillDao {
    /**
     * 减库存，
     *
     * @param seckillID
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillID, Date killTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    List<Seckill> queryAll(@Param("offset")int offset, @Param("limit") int limit);


}
