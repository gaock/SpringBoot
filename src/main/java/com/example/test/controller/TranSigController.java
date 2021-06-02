package com.example.test.controller;

import com.example.test.bean.BaseBean;
import com.example.test.bean.TranSig;
import com.example.test.service.TranSigService;
import com.example.test.util.FormatJson;
import org.json.JSONException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * (TranSig)表控制层
 *
 * @author makejava
 * @since 2021-06-01 16:44:34
 */
@Controller
public class TranSigController {
    /**
     * 服务对象
     */
    @Resource
    private TranSigService tranSigService;

    @RequestMapping(value = "/getTranSig", method = RequestMethod.POST, produces="text/html;charset=UTF-8")
    @ResponseBody
    public void TT6(HttpServletRequest req, HttpServletResponse res) throws IOException, JSONException {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String date = ft.format(dNow);
        System.out.println("*********************");
        System.out.println("date = " + date);
        System.out.println("*********************");

        List<BaseBean> data = this.tranSigService.queryByDate(date).stream().map(s->(BaseBean)s).collect(Collectors.toList());
        FormatJson formatter = new FormatJson();
        formatter.formatToResp(res, data);
    }
}
