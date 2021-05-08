package com.example.test.bean;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.catalina.mbeans.UserMBean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserBean extends BaseBean implements Serializable {
    private int id;
    private String name;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Map<String, String> getInfoMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", ""+id);
        map.put("name", name);
        map.put("password", password);
        return map;
    }
}
