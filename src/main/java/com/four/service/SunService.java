package com.four.service;


import com.four.entity.*;

import java.util.List;
import java.util.Map;

public interface SunService {

    List<Orientation> queryOrientation();

    Integer queryxuhao();

    String addchaoxiangSS(Orientation orientation);

    void deleteditie1(Integer id);

    void deleteidspishan(String id);

    Orientation updatechaoxianghui(Integer id);

    void updatechaoxianggai(Orientation orientation);

    List<Situation> querySituation();

    Integer queryxuhao2();

    String addqingkuangSS(Situation situation);

    void deleteQingKuang(Integer id);

    void deleteidspishan2(String id);

    Situation updateqingkuanghui(Integer id);

    void updateqingkuanggai(Situation situation);


    List<Map<Object,String>> queryzhongjie();
/*
    Huiji updatesyhyhuicha1(String id);

    List<Area> querydreadifangid1(String id);

    List<Huideng> queryhydj();

    List<Area> querydrea();

    void updatesyhygai(Huiji hj);

    Huirenzhuang queryhuiyuanrenzhneg(String id);*/
}
