package com.four.service.impl;

import com.four.dao.SunDao;
import com.four.entity.Orientation;
import com.four.entity.Situation;
import com.four.service.SunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
