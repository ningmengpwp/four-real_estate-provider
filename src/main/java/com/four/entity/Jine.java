package com.four.entity;

import java.io.Serializable;

public class Jine implements Serializable{
    private static final long serialVersionUID = -3879444567988439499L;
    private Integer id;

    private String jinid;

    private String jinnumber;

    private String jindis;

    private String jindate;

    private String jinip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJinid() {
        return jinid;
    }

    public void setJinid(String jinid) {
        this.jinid = jinid == null ? null : jinid.trim();
    }

    public String getJinnumber() {
        return jinnumber;
    }

    public void setJinnumber(String jinnumber) {
        this.jinnumber = jinnumber == null ? null : jinnumber.trim();
    }

    public String getJindis() {
        return jindis;
    }

    public void setJindis(String jindis) {
        this.jindis = jindis == null ? null : jindis.trim();
    }

    public String getJindate() {
        return jindate;
    }

    public void setJindate(String jindate) {
        this.jindate = jindate == null ? null : jindate.trim();
    }

    public String getJinip() {
        return jinip;
    }

    public void setJinip(String jinip) {
        this.jinip = jinip == null ? null : jinip.trim();
    }
}