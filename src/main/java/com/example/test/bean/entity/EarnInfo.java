package com.example.test.bean.entity;

import java.io.Serializable;

/**
 * (EarnInfo)实体类
 *
 * @author makejava
 * @since 2021-05-18 17:58:12
 */
public class EarnInfo implements Serializable {
    private static final long serialVersionUID = -52819947136275642L;

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

}
