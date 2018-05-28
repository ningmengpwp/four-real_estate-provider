package com.four.service;

import com.four.entity.Orientation;
import com.four.entity.Situation;

import java.util.List;

public interface SunService {
    List<Orientation> queryOrientation();
    Integer queryxuhao();
    String addchaoxiangSS(Orientation orientation);
    void deleteditie1(Integer id);
    void deleteidspishan(String id);
    Orientation updatechaoxianghui(Integer id);
    void updatechaoxianggai(Orientation orientation);
    //----------
    List<Situation> querySituation();
    Integer queryxuhao2();
    String addqingkuangSS(Situation situation);
    void deleteQingKuang(Integer id);
    void deleteidspishan2(String id);
    Situation updateqingkuanghui(Integer id);
    void updateqingkuanggai(Situation situation);
}
