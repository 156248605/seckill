package org.seckill.web.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by piaomiao on 2017/2/2.
 */
@Controller
@RequestMapping("/")
public class IndexController {
  private  static  final Logger logger = LoggerFactory.getLogger(IndexController.class);
  @RequestMapping(value = "/index",method = RequestMethod.GET)
  public String index(){

      System.out.println("我要的世界");

       return  null;
  }

}
