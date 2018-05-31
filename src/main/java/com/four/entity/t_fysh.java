package com.four.entity;

public class t_fysh {
    private Integer fyshztid;

    private String fyshzt;

    public Integer getFyshztid() {
        return fyshztid;
    }

    public void setFyshztid(Integer fyshztid) {
        this.fyshztid = fyshztid;
    }

    public String getFyshzt() {
        return fyshzt;
    }

    public void setFyshzt(String fyshzt) {
        this.fyshzt = fyshzt == null ? null : fyshzt.trim();
    }
}