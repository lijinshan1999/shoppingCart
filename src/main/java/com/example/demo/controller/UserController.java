package com.example.demo.controller;

import com.example.demo.dto.Result;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("register")
    public Result register(User user){
        Result result = new Result();
        //判断注册的用户名是否已存在
        if (userService.queryUserByName(user.getUsername()) != null){
            result.setState(Result.ERROR);
            result.setMsg("用户名已存在");
        } else {
            boolean isSuccess = userService.insertUser(user);
            result.setState(Result.OK);
            result.setMsg("注册成功！");
        }
        return result;
    }

    @PostMapping("login")
    public Result login(User user,HttpSession session){
        Result result = new Result();
        User u= userService.queryUser(user);
        if (u != null){
           result.setState(Result.OK);
           result.setMsg("登录成功");
           result.setData(u);
           session.setAttribute("user",u);
       } else {
           result.setState(Result.ERROR);
           result.setMsg("账号或密码错误");
       }

       return result;
    }
}
