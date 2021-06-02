package com.example.test.controller;

import com.example.test.bean.BaseBean;
import com.example.test.bean.LastBestTicInfo;
import com.example.test.service.LastBestTicInfoService;
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
import java.util.stream.Collectors;

/**
 * (LastBestTicInfo)表控制层
 *
 * @author makejava
 * @since 2021-06-01 16:44:33
 */
@Controller
public class LastBestTicInfoController {
    /**
     * 服务对象
     */
    @Resource
    private LastBestTicInfoService lastBestTicInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
//    @GetMapping("selectOne")
//    public LastBestTicInfo selectOne(Integer id) {
//        return this.lastBestTicInfoService.queryById(id);
//    }

    @RequestMapping(value = "/getAllBest", method = RequestMethod.POST)
    @ResponseBody
    public void TT6(HttpServletRequest req, HttpServletResponse res) throws IOException, JSONException {
        int count = Integer.parseInt(req.getParameter("count"));

        List<BaseBean> data = this.lastBestTicInfoService.queryLastBest(count).stream().map(s->(BaseBean)s).collect(Collectors.toList());
        FormatJson formatter = new FormatJson();
        formatter.formatToResp(res, data);
    }
}
