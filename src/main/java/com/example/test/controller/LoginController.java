package com.example.test.controller;

import com.example.test.service.AcctInfoService;
import com.example.test.bean.BaseBean;
import com.example.test.bean.UserBean;
import com.example.test.result.LogInResult;
import com.example.test.service.UserService;
import com.example.test.util.FormatJson;
import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class LoginController {

    //将Service注入Web层
    @Resource
    UserService userService;
    @Resource
    AcctInfoService acctInfoService;

//    @Autowired
//    FormatJson formatJson;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping("/index")
    public String index_show(){
        return "index";
    }

    @RequestMapping("/data_show")
    public String success_show(){
        return "data_show";
    }
    @RequestMapping("/easyui")
    public String easyui_show(){
        return "easyui";
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

    @RequestMapping(value = "/getAllData",method = RequestMethod.POST)
    @ResponseBody
    public void TT5(HttpServletRequest req, HttpServletResponse res) throws IOException, JSONException {
        System.out.println("-----------------");

        List<BaseBean> data = userService.getAllData().stream().map(s->(BaseBean)s).collect(Collectors.toList());
        FormatJson formatter = new FormatJson();
        System.out.println("data: " + data);
        formatter.formatToResp(res, data);
    }

}
