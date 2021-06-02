package com.example.test.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * (TranSig)实体类
 *
 * @author makejava
 * @since 2021-06-01 16:44:33
 */
public class TranSig extends BaseBean implements Serializable {
    private static final long serialVersionUID = -55124336800180419L;

    private Integer id;

    private String date;

    private String tId;

    private String name;

    private String op;

    private Integer num;

    private String simplePrice;

    private String reallyPrice;

    private String tranEarn;

    private String midMoney;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTId() {
        return tId;
    }

    public void setTId(String tId) {
        this.tId = tId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSimplePrice() {
        return simplePrice;
    }

    public void setSimplePrice(String simplePrice) {
        this.simplePrice = simplePrice;
    }

    public String getReallyPrice() {
        return reallyPrice;
    }

    public void setReallyPrice(String reallyPrice) {
        this.reallyPrice = reallyPrice;
    }

    public String getTranEarn() {
        return tranEarn;
    }

    public void setTranEarn(String tranEarn) {
        this.tranEarn = tranEarn;
    }

    public String getMidMoney() {
        return midMoney;
    }

    public void setMidMoney(String midMoney) {
        this.midMoney = midMoney;
    }

//    @Override
//    public Map<String, String> getInfoMap() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("id", ""+ id.toString());
//        map.put("date", date);
//        map.put("tId", tId);
//        map.put("name", name);
//        map.put("op", op);
//        map.put("num", num.toString());
//        map.put("simplePrice", simplePrice);
//        map.put("reallyPrice", reallyPrice);
//        map.put("tranEarn", tranEarn);
//        map.put("midMoney", midMoney);
//        return map;
//    }
}
