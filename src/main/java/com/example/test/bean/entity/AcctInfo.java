package com.example.test.bean.entity;

import java.io.Serializable;

/**
 * (AcctInfo)实体类
 *
 * @author makejava
 * @since 2021-05-18 17:58:02
 */
public class AcctInfo implements Serializable {
    private static final long serialVersionUID = 282112676107913922L;

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

}
