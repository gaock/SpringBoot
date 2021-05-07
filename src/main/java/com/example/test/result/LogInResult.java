package com.example.test.result;

import java.io.Serializable;

public class LogInResult implements Serializable  {
    private static final long serialVersionUID = 1L;
    private String retCode = "000000";

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }
}
