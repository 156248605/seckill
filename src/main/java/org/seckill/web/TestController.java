package org.seckill.web;
import org.seckill.dao.SeckillDao;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
     @Autowired
     private SeckillDao seckillDao;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String test(Model model){
     Seckill seckill = seckillDao.selectByPrimaryKey(Long.valueOf("1000"));
        System.out.println(seckill.getName());
     return null;

    }



}
