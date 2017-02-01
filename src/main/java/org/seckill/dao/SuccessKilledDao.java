package org.seckill.dao;
import org.seckill.entity.SuccessKilled;
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可过滤重复
     * @param seckillId
     * @param userPhone
     * @return 插入行数
     */
    int insertSuccessKilled(long seckillId , long userPhone);
    /**
     * 根据id查询秒杀详情（带Seckill实体）
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId,long userPhone);
}
