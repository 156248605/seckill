package org.seckill.web.admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * Created by piaomiao on 2017/2/2.
 */
@Controller
@RequestMapping("/test1")
public class TestAdminController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public  String test(Model model){
        System.out.println("123456");
        return "test";
    }
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String test1(Model model){
        System.out.println("78910");
        return null;

    }








}
