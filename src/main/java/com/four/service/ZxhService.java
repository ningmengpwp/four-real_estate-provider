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

    List<Map<String,Object>> selectFangyuan();

    String deleteYuanId(Integer id);

    String deleteIdAll(String ids);

    String updateYuanChuId(String ids);

    String updateDownChuId(String ids);

    List<Apartment> queryApart();

    List<Map<String,Object>> queryZhuang();

    String deleteZhuangIdAll(String ids);

    List<Huiquan> selectQuan();

    Huiji selectXiuId(Integer id);

}
