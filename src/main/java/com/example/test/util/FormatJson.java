package com.example.test.util;

import com.example.test.bean.BaseBean;
import com.example.test.bean.UserBean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormatJson {
    public HttpServletResponse formatToResp(HttpServletResponse res, List<BaseBean> data) throws IOException, JSONException {
        int length = data.toArray().length;
        JSONArray array = new JSONArray();
        for(BaseBean item: data) {
            JSONObject column = new JSONObject();
            Map<String, String> map = item.getInfoMap();
            map.forEach((k, v) ->{
                try {
                    column.put(k, v);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            });
            array.put(column);
        }

        JSONObject jo = new JSONObject();
        jo.put("total", length);
        jo.put("rows", array);
        System.out.println(jo);
        String result = jo.toString();



        res.setHeader("Content-type", "text/html;charset=UTF-8");
        res.setCharacterEncoding("UTF-8");
        res.setContentType("application/json");
//        OutputStream out = res.getOutputStream();
//        out.write(result.getBytes(StandardCharsets.UTF_8));
//        out.flush();
//        out.close();
        PrintWriter writer = res.getWriter();
        writer.print(result);
        writer.flush();
        writer.close();
        System.out.println(res);
        return res;
    }
}
