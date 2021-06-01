package com.example.test.bean;

import java.io.Serializable;

/**
 * (TranSig)实体类
 *
 * @author makejava
 * @since 2021-06-01 16:44:33
 */
public class TranSig implements Serializable {
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

}
