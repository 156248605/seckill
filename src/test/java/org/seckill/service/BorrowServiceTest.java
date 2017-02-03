package org.seckill.service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Borrow;
import org.seckill.utils.PropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by piaomiao on 2017/2/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class BorrowServiceTest {
    private  final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BorrowService borrowService;
    @Test
    public void getById() throws Exception {
        Integer borrowid = 146;
        Borrow borrow = borrowService.getById(borrowid);
        System.out.println(borrow.getBorrowTitle());
    }
    @Test
    public void deleteById() throws Exception {
        Integer borrowid = 150;
        int i = borrowService.deleteById(borrowid);
        System.out.println(i);
    }
    
    @Test
    public  void  getList() throws  Exception{
        List<Borrow> list = borrowService.selectPage(2,8);
        for (Borrow borrow:list) {
            System.out.println(borrow.getId());
        }
        
    }

   //随便测测就放这里
   @Test
   public  void  test() throws Exception{
       System.out.println(PropertiesUtil.get("AGREEMENT.PDF.WATERMARK.FILEPATH"));
   }

}
