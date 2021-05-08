package com.example.test.util;

import com.example.test.bean.BaseBean;
import com.example.test.bean.UserBean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormatJson {
    public HttpServletResponse formatToResp(HttpServletResponse res, List<BaseBean> data) throws IOException, JSONException {
        System.out.println("-----------------");
        PrintWriter writer = res.getWriter();
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
        writer.print(jo);
        writer.flush();
        writer.close();
        return res;
    }
}
