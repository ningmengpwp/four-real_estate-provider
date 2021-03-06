package com.four.service;

import com.four.entity.*;

import java.util.List;
import java.util.Map;

public interface ZxhService {
    List<Member> selectHui();

    String updatePass(String yuan, String userpass, User user);

    Integer selectMaxXu();

    String insertMem(Member member);

    Member selectMemId(Integer id);

    String updateHuiId(Member member);

    String deleteMemId(Integer id);

    String deleteAllIds(String ids);

    List<Map<String,Object>> selectShang();

    List<Area> queryAreall();

    String insertBusin(Business business);

    String deleteShangId(String id);

    String deleteBusall(String ids);

    Business selectBusId(Integer id);

    String updateBusId(Business business);

    List<Map<String,Object>> selectZiXun();

    String deleteZiId(String id);

    String insertZixun(Consultinglist consultinglist);

    List<Consultingcontent> selectConsultall();

    List<Advisory> selectAdvall();

    String deleteZixall(String ids);

    String updateShenz(Integer flag, String ids);

    Consultinglist selectQueryId(Integer id);

    String updateZiId(Consultinglist consultinglist);

    List<Map<String,Object>> selectShenZiXun();

    List<Map<String,Object>> selectFangyuan(Integer auditstatus);

    String deleteYuanId(Integer id);

    String deleteIdAll(String ids);

    String updateYuanChuId(String ids);

    String updateDownChuId(String ids);

    List<Apartment> queryApart();

    List<Map<String,Object>> queryZhuang();

    String deleteZhuangIdAll(String ids);

    List<Huiquan> selectQuan();

    Huiji selectXiuId(Integer id);

    Huirenshen selectQueRen(Integer id);

    String updateZhuYuanId(Huiji huiji);

    String updateRenZhenId(Huirenshen huirenshen);

    String updateRenQuanId(Huirenshen huirenshen);

    String updateJineId(Huijin huijin, String addr);

    List<Map<String,Object>> queryzijin(String jindis);

    String deletezijin(String id);

    String updateFangListIds(Integer flag, String ids);

    String updateFangJiaIds(Integer flag, Integer ids);

    List<Huiji> queryHuijiDate();

    Huiji selectRenMingId(Integer id);

    Apartment selectTypeLeid(Integer id);

    String insertFangChuShou(Housing housing);

    List<School> selectSchoolPid();

    List<Situation> selectSituaAll();

    List<Time> selectTimeAll();

    List<Orientation> selectOrienAll();

    List<Retailindustry> selectRetaPid();

    List<Storetype> selectShangType();

    List<Pavenmenttype> selectPaveTypeAll();

    List<School> selectSchoolTypeCount(Integer pid);

    List<Feature> selectFeatureAll(Integer sel);

    List<Mating> selectMatingAll(Integer sel);

    List<Retailindustry> queryReadPidsid(Integer id);

    Housing selectChuFangYuanId(Integer id);

    String updateFangChuShouId(Housing housing);

}
