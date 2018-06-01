package com.four.service.impl;

import com.four.dao.GbyDao;
import com.four.entity.*;
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
    public List<Map<Object, String>> queryjingji() {
        return gbyDao.queryjingji();
    }
    //查询回显所有会员
    @Override
    public Huiji updatesyhyhuicha(String id) {
        return gbyDao.updatesyhyhuicha(id);
    }
    //查询所有会员等级
    @Override
    public List<Huideng> queryhydj() {
        return gbyDao.queryhydj();
    }
    //查询所有会员地区
    @Override
    public List<Area> querydrea() {
        return gbyDao.querydrea();
    }
    //查询所有会员地区地方
    @Override
    public List<Area> querydreadifangid(String id) {
        return gbyDao.querydreadifangid(id);
    }
    //修改所有会员
    @Override
    public void updatesyhygai(Huiji hj) {
        gbyDao.updatesyhygai(hj);
    }
   //c出租管理
    @Override
    public List<Map<String, Object>> querychuzu(Integer wuyeid, String chuzuname) {
        return gbyDao.querychuzu(wuyeid,chuzuname);
    }

    @Override
    public List<Map<String, Object>> querychuzuxx(Integer id) {
        return gbyDao.querychuzuxx(id);
    }

    @Override
    public List<Public> querygongjiao() {
        return gbyDao.querygongjiao();
    }

    @Override
    public List<Metro> queryditie() {
        return gbyDao.queryditie();
    }

    @Override
    public List<Feature> querywuye() {
        return gbyDao.querywuye();
    }

    @Override
    public List<Mating> querypeitao() {
        return gbyDao.querypeitao();
    }

    @Override
    public List<Retailindustry> queryhangye() {
        return gbyDao.queryhangye();
    }

    @Override
    public List<Storetype> querypumian() {
        return gbyDao.querypumian();
    }

    @Override
    public List<Pavenmenttype> querypumian1() {
        return gbyDao.querypumian1();
    }

    @Override
    public List<Situation> queryfangwu() {
        return gbyDao.queryfangwu();
    }

    @Override
    public List<Orientation> querychaoxiang() {
        return gbyDao.querychaoxiang();
    }

    @Override
    public t_chuzugl queryByIdchuzu(Integer id) {
        return gbyDao.queryByIdchuzu(id);
    }

    @Override
    public void updatechuzu(t_chuzugl chuzugl) {
        gbyDao.updatechuzu(chuzugl);
    }

    @Override
    public void updateShangX(String id) {
        List<Map<String,Object>> map=gbyDao.queryShX(id);
        for(int i=0; i<map.size(); i++){
            if(map.get(i).get("chuzusxj")==Integer.valueOf(1)){
                gbyDao.updateShang(map.get(i).get("chuzuid"));
            }else if(map.get(i).get("chuzusxj")==Integer.valueOf(2)){
                gbyDao.updateXia(map.get(i).get("chuzuid"));
            }
        }
    }

    @Override
    public void updateBinG(String ids, Integer zt) {
        gbyDao.updateBinG(ids,zt);
    }

    @Override
    public void deleteschuzu(String ids) {
        gbyDao.deleteschuzu(ids);
    }

    @Override
    public void updatechutuidw(String ids) {
        gbyDao.updatechutuidw(ids);
    }

    @Override
    public void updateqxchutuidw(String ids) {
        gbyDao.updateqxchutuidw(ids);
    }

    @Override
    public List<Map<String, Object>> querysuoyou() {
        return gbyDao.querysuoyou();
    }

    @Override
    public void deleteyuyue(String id) {
        gbyDao.deleteyuyue(id);
    }

    @Override
    public List<Map<String, Object>> queryChuShou() {

        return gbyDao.queryChuShou();
    }

    @Override
    public void deleteyChuShou(String id) {
        gbyDao.deleteyChuShou(id);
    }

    @Override
    public List<Map<String, Object>> queryChuZu() {
        return gbyDao.queryChuZu();
    }

    @Override
    public void deleteyChuZu(String id) {
        gbyDao.deleteyChuZu(id);
    }


}
