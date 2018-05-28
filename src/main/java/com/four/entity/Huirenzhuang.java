package com.four.entity;

import java.io.Serializable;

public class Huirenzhuang implements Serializable {

    private static final long serialVersionUID = 7000902882539153602L;
    //会员管理认证状态
    private int huirenid;
    private String huirenztai;

    public int getHuirenid() {
        return huirenid;
    }

    public void setHuirenid(int huirenid) {
        this.huirenid = huirenid;
    }

    public String getHuirenztai() {
        return huirenztai;
    }

    public void setHuirenztai(String huirenztai) {
        this.huirenztai = huirenztai;
    }

    @Override
    public String toString() {
        return "Huirenzhuang{" +
                "huirenid=" + huirenid +
                ", huirenztai='" + huirenztai + '\'' +
                '}';
    }
}
