package org.seckill.web.front;
import org.seckill.entity.User;
import org.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
     @Autowired
     private UserService userService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String test(Model model){
        User user = userService.getById(Integer.valueOf("1952"));
        System.out.println(user.getUserRealname());
        return "list";

    }



}
