package com.four.service.impl;

import com.four.dao.GbyDao;
import com.four.entity.Apartment;
import com.four.entity.Feature;
import com.four.service.GbyService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class GbyServiceImpl implements GbyService{
    @Autowired
    private GbyDao gbyDao;
    //查询
    @Override
    public List<Apartment> queryApartment() {
        return gbyDao.queryApartment();
    }
    //排序
    @Override
    public Integer querycount() {
        return gbyDao.querycount();
    }
    //新增
    @Override
    public void addApartment(Apartment apartment) {
        apartment.setZhanname(apartment.getYuanname());
        gbyDao.addApartment(apartment);
    }
    //删除
    @Override
    public void deleteApartment(Integer id) {
        gbyDao.deleteApartment(id);
    }
    //回显
    @Override
    public Apartment queryById(Integer id) {
        return gbyDao.queryById(id);
    }
    //修改
    @Override
    public void updateApartment(Apartment apartment) {
        gbyDao.updateApartment(apartment);
    }
    //查询物业特色设置
    @Override
    public List<Feature> queryFeature() {
        return gbyDao.queryFeature();
    }
    //p排序
    @Override
    public Integer querycount1() {
        return gbyDao.querycount1();
    }
    //c查询
    @Override
    public List<Apartment> queryApartment1() {
        return gbyDao.queryApartment1();
    }
    //c查询
    @Override
    public List<Apartment> queryApartment2() {
        return gbyDao.queryApartment2();
    }
    //新增物业特色
    SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    @Override
    public void addFeature(Feature feature) {
        feature.setCreatedate(sim.format(new Date()));
        gbyDao.addFeature(feature);
    }
    //删除
    @Override
    public void deleteFeature(Integer id) {
        gbyDao.deleteFeature(id);
    }
    //批量删除
    @Override
    public void deleteswuyetese(String ids) {
        gbyDao.deleteswuyetese(ids);
    }
    //回显
    @Override
    public Feature queryByIdwuyetese(Integer id) {
        return gbyDao.queryByIdwuyetese(id);
    }
    //删除
    @Override
    public void updatewuyetese(Feature feature) {
        gbyDao.updatewuyetese(feature);
    }
    //查询经纪人
    @Override
    public List<Map<String, Object>> queryjingji() {
        return gbyDao.queryjingji();
    }


}
