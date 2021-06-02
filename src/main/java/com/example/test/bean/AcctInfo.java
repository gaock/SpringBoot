package com.example.test.bean;

import com.example.test.bean.BaseBean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * (AcctInfo)实体类
 *
 * @author makejava
 * @since 2021-06-01 16:44:31
 */
public class AcctInfo extends BaseBean implements Serializable {
    private static final long serialVersionUID = 531219672189473598L;

    private String date;

    private String totalMoney;

    private String ticMoney;

    private String cash;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getTicMoney() {
        return ticMoney;
    }

    public void setTicMoney(String ticMoney) {
        this.ticMoney = ticMoney;
    }

    public String getCash() {
        return cash;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

//    @Override
//    public Map<String, String> getInfoMap() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("date", ""+date);
//        map.put("totalMoney", totalMoney);
//        map.put("ticMoney", ticMoney);
//        map.put("cash", cash);
//        return map;
//    }
}
