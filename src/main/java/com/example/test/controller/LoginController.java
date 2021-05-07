package com.example.test.controller;

import com.example.test.bean.UserBean;
import com.example.test.result.LogInResult;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping("/index")
    public String index_show(){
        return "index";
    }
    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    @ResponseBody
    public LogInResult login(String name, String password){
        UserBean userBean = userService.loginIn(name,password);
        LogInResult res = new LogInResult();
        if(userBean == null){
            res.setRetCode("-1");
        }
        return res;
    }
}
