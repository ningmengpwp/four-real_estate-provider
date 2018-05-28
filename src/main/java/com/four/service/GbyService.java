package com.four.service;

import com.four.entity.Apartment;
import com.four.entity.Feature;

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

    List<Map<String,Object>> queryjingji();
}
