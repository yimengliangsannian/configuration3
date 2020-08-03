package cn.sz.controller;

import cn.sz.User;
import cn.sz.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserConctoller {

    @Reference
    private UserService userService;

    @GetMapping("/findById/{id}")
    public String findById(@PathVariable("id") Integer id){
        User user = userService.findById(id);
        System.out.println(user);
        return user.toString();
    }


}
