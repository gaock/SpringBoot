package com.example.test.bean;

import java.io.Serializable;

/**
 * (LastBestTicInfo)实体类
 *
 * @author makejava
 * @since 2021-05-18 17:58:13
 */
public class LastBestTicInfo implements Serializable {
    private static final long serialVersionUID = -77100153588244564L;

    private Integer id;

    private String tId;

    private String name;

    private String buyPrice;

    private String soldPric;

    private String earnRate;

    private Integer usedDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    public String getSoldPric() {
        return soldPric;
    }

    public void setSoldPric(String soldPric) {
        this.soldPric = soldPric;
    }

    public String getEarnRate() {
        return earnRate;
    }

    public void setEarnRate(String earnRate) {
        this.earnRate = earnRate;
    }

    public Integer getUsedDate() {
        return usedDate;
    }

    public void setUsedDate(Integer usedDate) {
        this.usedDate = usedDate;
    }

}
