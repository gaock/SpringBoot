package com.example.test.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * (EarnInfo)实体类
 *
 * @author makejava
 * @since 2021-06-01 16:44:31
 */
public class EarnInfo extends BaseBean implements Serializable {
    private static final long serialVersionUID = -44465650030556904L;

    private String date;

    private String earnRate;

    private String hs300;

    private String compRate;

    private String usedRate;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEarnRate() {
        return earnRate;
    }

    public void setEarnRate(String earnRate) {
        this.earnRate = earnRate;
    }

    public String getHs300() {
        return hs300;
    }

    public void setHs300(String hs300) {
        this.hs300 = hs300;
    }

    public String getCompRate() {
        return compRate;
    }

    public void setCompRate(String compRate) {
        this.compRate = compRate;
    }

    public String getUsedRate() {
        return usedRate;
    }

    public void setUsedRate(String usedRate) {
        this.usedRate = usedRate;
    }

//    @Override
//    public Map<String, String> getInfoMap() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("date", ""+ date);
//        map.put("earnRate", earnRate);
//        map.put("hs300", hs300);
//        map.put("compRate", compRate);
//        map.put("usedRate", usedRate);
//        return map;
//    }
}
