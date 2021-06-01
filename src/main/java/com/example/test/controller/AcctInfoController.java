package com.example.test.controller;

import com.example.test.bean.AcctInfo;
import com.example.test.service.AcctInfoService;
import com.example.test.bean.BaseBean;
import com.example.test.util.FormatJson;
import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * (AcctInfo)表控制层
 *
 * @author makejava
 * @since 2021-06-01 16:44:31
 */
@Controller
public class AcctInfoController {
    /**
     * 服务对象
     */
    @Resource
    private AcctInfoService acctInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public AcctInfo selectOne(String id) {
        System.out.println("acct_info get:" + id);
        return this.acctInfoService.queryById(id);
    }

    @RequestMapping(value = "/getAcctInfo", method = RequestMethod.POST)
    @ResponseBody
    public void TT6(HttpServletRequest req, HttpServletResponse res) throws IOException, JSONException {
        PrintWriter writer = res.getWriter();
        String date = req.getParameter("date");

        BaseBean acct = (BaseBean) this.acctInfoService.queryById(date);
        List<BaseBean> data = new ArrayList<>();
        data.add(acct);
        FormatJson formatter = new FormatJson();
        formatter.formatToResp(res, data);
    }

}
