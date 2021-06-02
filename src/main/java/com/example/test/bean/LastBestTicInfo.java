package com.example.test.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * (LastBestTicInfo)实体类
 *
 * @author makejava
 * @since 2021-06-01 16:44:32
 */
public class LastBestTicInfo extends BaseBean implements Serializable {
    private static final long serialVersionUID = 746895427067728524L;

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

//    @Override
//    public Map<String, String> getInfoMap() {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("id", ""+ id.toString());
//        map.put("tId", tId);
//        map.put("name", name);
//        map.put("buyPrice", buyPrice);
//        map.put("soldPric", soldPric);
//        map.put("earnRate", earnRate);
//        map.put("usedDate", usedDate.toString());
//        return map;
//    }
}
