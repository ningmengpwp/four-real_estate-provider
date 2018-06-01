package com.four.service;

import com.four.entity.*;

import java.util.List;
import java.util.Map;

public interface GbyService {
    List<Apartment> queryApartment();

    Integer querycount();

    void addApartment(Apartment apartment);

    void deleteApartment(Integer id);

    Apartment queryById(Integer id);
    void updateApartment(Apartment apartment);
    List<Feature> queryFeature();

    Integer querycount1();

    List<Apartment> queryApartment1();

    List<Apartment> queryApartment2();

    void addFeature(Feature feature);

    void deleteFeature(Integer id);

    void deleteswuyetese(String ids);

    Feature queryByIdwuyetese(Integer id);

    void updatewuyetese(Feature feature);

    List<Map<Object,String>> queryjingji();

    Huiji updatesyhyhuicha(String id);

    List<Huideng> queryhydj();

    List<Area> querydrea();

    List<Area> querydreadifangid(String id);

    void updatesyhygai(Huiji hj);

    List<Map<String,Object>> querychuzu(Integer wuyeid, String chuzuname);

    List<Map<String,Object>> querychuzuxx(Integer id);

    List<Public> querygongjiao();

    List<Metro> queryditie();

    List<Feature> querywuye();

    List<Mating> querypeitao();

    List<Retailindustry> queryhangye();

    List<Storetype> querypumian();

    List<Pavenmenttype> querypumian1();

    List<Situation> queryfangwu();

    List<Orientation> querychaoxiang();

    t_chuzugl queryByIdchuzu(Integer id);

    void updatechuzu(t_chuzugl chuzugl);

    void updateShangX(String id);

    void updateBinG(String ids, Integer zt);

    void deleteschuzu(String ids);

    void updatechutuidw(String ids);

    void updateqxchutuidw(String ids);
}
