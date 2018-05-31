package com.four.entity;

import java.io.Serializable;

public class t_qiugougl implements Serializable{
    private static final long serialVersionUID = 8127701452093214543L;
    private Integer qiugouid;

    private Integer wuyeid;

    private String biaoti;

    private Integer quyupid;

    private Integer quyuid;

    private String feiyongyusuan;

    private String mianjiyaoqiu;

    private String miaoshu;

    private Integer shangxiajia;

    private Integer tuijian;

    private String lianxihaoma;

    private String lianxiren;

    private Integer gouorzu;

    public Integer getQiugouid() {
        return qiugouid;
    }

    public void setQiugouid(Integer qiugouid) {
        this.qiugouid = qiugouid;
    }

    public Integer getWuyeid() {
        return wuyeid;
    }

    public void setWuyeid(Integer wuyeid) {
        this.wuyeid = wuyeid;
    }

    public String getBiaoti() {
        return biaoti;
    }

    public void setBiaoti(String biaoti) {
        this.biaoti = biaoti == null ? null : biaoti.trim();
    }

    public Integer getQuyupid() {
        return quyupid;
    }

    public void setQuyupid(Integer quyupid) {
        this.quyupid = quyupid;
    }

    public Integer getQuyuid() {
        return quyuid;
    }

    public void setQuyuid(Integer quyuid) {
        this.quyuid = quyuid;
    }

    public String getFeiyongyusuan() {
        return feiyongyusuan;
    }

    public void setFeiyongyusuan(String feiyongyusuan) {
        this.feiyongyusuan = feiyongyusuan == null ? null : feiyongyusuan.trim();
    }

    public String getMianjiyaoqiu() {
        return mianjiyaoqiu;
    }

    public void setMianjiyaoqiu(String mianjiyaoqiu) {
        this.mianjiyaoqiu = mianjiyaoqiu == null ? null : mianjiyaoqiu.trim();
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu == null ? null : miaoshu.trim();
    }

    public Integer getShangxiajia() {
        return shangxiajia;
    }

    public void setShangxiajia(Integer shangxiajia) {
        this.shangxiajia = shangxiajia;
    }

    public Integer getTuijian() {
        return tuijian;
    }

    public void setTuijian(Integer tuijian) {
        this.tuijian = tuijian;
    }

    public String getLianxihaoma() {
        return lianxihaoma;
    }

    public void setLianxihaoma(String lianxihaoma) {
        this.lianxihaoma = lianxihaoma == null ? null : lianxihaoma.trim();
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren == null ? null : lianxiren.trim();
    }

    public Integer getGouorzu() {
        return gouorzu;
    }

    public void setGouorzu(Integer gouorzu) {
        this.gouorzu = gouorzu;
    }

    @Override
    public String toString() {
        return "t_qiugougl{" +
                "qiugouid=" + qiugouid +
                ", wuyeid=" + wuyeid +
                ", biaoti='" + biaoti + '\'' +
                ", quyupid=" + quyupid +
                ", quyuid=" + quyuid +
                ", feiyongyusuan='" + feiyongyusuan + '\'' +
                ", mianjiyaoqiu='" + mianjiyaoqiu + '\'' +
                ", miaoshu='" + miaoshu + '\'' +
                ", shangxiajia=" + shangxiajia +
                ", tuijian=" + tuijian +
                ", lianxihaoma='" + lianxihaoma + '\'' +
                ", lianxiren='" + lianxiren + '\'' +
                ", gouorzu=" + gouorzu +
                '}';
    }
}