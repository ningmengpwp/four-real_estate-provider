package com.four.service.impl;

import com.four.dao.SunDao;
import com.four.entity.*;
import com.four.service.SunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SunServiceImpl implements SunService {
    @Autowired
    private SunDao sunDao;
    @Override
    public List<Orientation> queryOrientation() {
        return sunDao.queryOrientation();
    }

    @Override
    public Integer queryxuhao() {

        return sunDao.queryxuhao();
    }

    @Override
    public String addchaoxiangSS(Orientation orientation) {
        sunDao.addchaoxiangSS(orientation);
        return "success";
    }

    @Override
    public void deleteditie1(Integer id) {
        sunDao.deleteditie1(id);
    }

    @Override
    public void deleteidspishan(String id) {
        String[] split = id.split(",");
        for (int i = 0; i <split.length ; i++) {
            sunDao.deleteidspishan(split[i]);
        }

    }

    @Override
    public Orientation updatechaoxianghui(Integer id) {

        return sunDao.updatechaoxianghui(id);
    }

    @Override
    public void updatechaoxianggai(Orientation orientation) {
        sunDao.updatechaoxianggai(orientation);
    }

    @Override
    public List<Situation> querySituation() {
        return sunDao.querySituation();
    }

    @Override
    public Integer queryxuhao2() {
        return sunDao.queryxuhao2();
    }

    @Override
    public String addqingkuangSS(Situation situation) {
        sunDao.addqingkuangSS(situation);
        return "success1";
    }

    @Override
    public void deleteQingKuang(Integer id) {
        sunDao.deleteQingKuang(id);
    }

    @Override
    public void deleteidspishan2(String id) {
        String[] split = id.split(",");
        for (int i = 0; i <split.length ; i++) {
            sunDao.deleteidspishan2(split[i]);
        }
    }

    @Override
    public Situation updateqingkuanghui(Integer id) {
        return sunDao.updateqingkuanghui(id);
    }

    @Override
    public void updateqingkuanggai(Situation situation) {
        sunDao.updateqingkuanggai(situation);
    }

    @Override
    public List<Map<Object, String>> queryzhongjie() {
        return sunDao.queryzhongjie();
    }

    /*@Override
    public Huiji updatesyhyhuicha1(String id) {
        return sunDao.updatesyhyhuicha1(id);
    }

    @Override
    public List<Area> querydreadifangid1(String id) {
        return sunDao.querydreadifangid1(id);
    }

    @Override
    public List<Huideng> queryhydj() {
        return sunDao.queryhydj();
    }

    @Override
    public List<Area> querydrea() {
        return sunDao.querydrea();
    }

    @Override
    public void updatesyhygai(Huiji hjj) {
        sunDao.updatesyhygai(hjj);
    }

    @Override
    public Huirenzhuang queryhuiyuanrenzhneg(String id) {
        return sunDao.queryhuiyuanrenzhneg(id);
    }*/
}
