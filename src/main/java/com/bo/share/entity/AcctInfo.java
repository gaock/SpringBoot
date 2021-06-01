package com.bo.share.entity;

import java.io.Serializable;

/**
 * (AcctInfo)实体类
 *
 * @author makejava
 * @since 2021-06-01 16:37:18
 */
public class AcctInfo implements Serializable {
    private static final long serialVersionUID = 327883704979053852L;

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
