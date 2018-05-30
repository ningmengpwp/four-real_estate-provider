package com.four.service.impl;

import com.four.dao.ZxhDao;
import com.four.entity.*;
import com.four.mysqlzc.ReadOnlyConnection;
import com.four.service.ZxhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("zxhService")
public class ZxhServiceImpl implements ZxhService {

    @Autowired
    private ZxhDao zxhdao;

    /*@ReadOnlyConnection*/
    @Override
    public List<Member> selectHui() {
        List<Member> list = zxhdao.selectHui();
        return list;
    }

    @Override
    public String updatePass(String yuan, String userpass, User user) {
        User users = zxhdao.queryUser(user.getUserid());
        if(yuan.equals(users.getUserpass())){
            zxhdao.updatePass(user.getUserid(),userpass);
            return "success";
        }else{
            return "error";
        }
    }

    @Override
    public Integer selectMaxXu() {
        Integer maxpai = zxhdao.selectMaxXu();
        return maxpai;
    }

    @Override
    public String insertMem(Member member) {
        zxhdao.insertMem(member);
        return "success";
    }

    @Override
    public Member selectMemId(Integer id) {
        Member member = zxhdao.selectMemId(id);
        return member;
    }

    @Override
    public String updateHuiId(Member member) {
        zxhdao.updateHuiId(member);
        return "success";
    }

    @Override
    public String deleteMemId(Integer id) {
        zxhdao.deleteMemId(id);
        return "success";
    }

    @Override
    public String deleteAllIds(String ids) {
        zxhdao.deleteAllIds(ids);
        return "success";
    }

    @Override
    public List<Map<String,Object>> selectShang() {
        List<Map<String,Object>> list = zxhdao.selectShang();
        return list;
    }

    @Override
    public List<Area> queryAreall() {
        List<Area> list = zxhdao.queryAreall();
        return list;
    }

    @Override
    public String insertBusin(Business business) {
        zxhdao.insertBusin(business);
        return "success";
    }

    @Override
    public String deleteShangId(String id) {
        zxhdao.deleteShangId(id);
        return "success";
    }

    @Override
    public String deleteBusall(String ids) {
        zxhdao.deleteBusall(ids);
        return "success";
    }

    @Override
    public Business selectBusId(Integer id) {
        Business business = zxhdao.selectBusId(id);
        return business;
    }

    @Override
    public String updateBusId(Business business) {
        zxhdao.updateBusId(business);
        return "success";
    }

    @Override
    public List<Map<String, Object>> selectZiXun() {
        List<Map<String, Object>> list = zxhdao.selectZiXun();
        return list;
    }

    @Override
    public String deleteZiId(String id) {
        zxhdao.deleteZiId(id);
        return "success";
    }

    @Override
    public String insertZixun(Consultinglist consultinglist) {
        zxhdao.insertZixun(consultinglist);
        return "success";
    }

    @Override
    public List<Consultingcontent> selectConsultall() {
        List<Consultingcontent> list = zxhdao.selectConsultall();
        return list;
    }

    @Override
    public List<Advisory> selectAdvall() {
        List<Advisory> list = zxhdao.selectAdvall();
        return list;
    }

    @Override
    public String deleteZixall(String ids) {
        zxhdao.deleteZixall(ids);
        return "success";
    }

    @Override
    public String updateShenz(Integer flag, String ids) {
        zxhdao.updateShenz(flag,ids);
        return "success";
    }

    @Override
    public Consultinglist selectQueryId(Integer id) {
        Consultinglist consultinglist = zxhdao.selectQueryId(id);
        return consultinglist;
    }

    @Override
    public String updateZiId(Consultinglist consultinglist) {
        zxhdao.updateZiId(consultinglist);
        return "success";
    }

    @Override
    public List<Map<String,Object>> selectShenZiXun() {
        List<Map<String,Object>> list = zxhdao.selectShenZiXun();
        return list;
    }

    @Override
    public List<Map<String, Object>> selectFangyuan() {
        List<Map<String, Object>> list = zxhdao.selectFangyuan();
        return list;
    }

    @Override
    public String deleteYuanId(Integer id) {
        zxhdao.deleteYuanId(id);
        return "success";
    }

    @Override
    public String deleteIdAll(String ids) {
        zxhdao.deleteIdAll(ids);
        return "success";
    }

    @Override
    public String updateYuanChuId(String ids) {
        zxhdao.updateYuanChuId(ids);
        return "success";
    }

    @Override
    public String updateDownChuId(String ids) {
        zxhdao.updateDownChuId(ids);
        return "success";
    }

    @Override
    public List<Apartment> queryApart() {
        List<Apartment> list = zxhdao.queryApart();
        return list;
    }

    @Override
    public List<Map<String, Object>> queryZhuang() {
        List<Map<String, Object>> list = zxhdao.queryZhuang();
        return list;
    }

    @Override
    public String deleteZhuangIdAll(String ids) {
        String[] id = ids.split(",");
        for (int i=0;i<id.length;i++){
            Huiji huiji = zxhdao.selectZhuId(id[i]);
            zxhdao.deleteZhuId(huiji.getHuijinid());
        }
        zxhdao.deleteZhuangIdAll(ids);
        return "success";
    }

    @Override
    public List<Huiquan> selectQuan() {
        List<Huiquan> list = zxhdao.selectQuan();
        return list;
    }

    @Override
    public Huiji selectXiuId(Integer id) {
        Huiji huiji = zxhdao.selectXiuId(id);
        return huiji;
    }

    @Override
    public Huirenshen selectQueRen(Integer id) {
        Huirenshen huirenshen = zxhdao.selectQueRen(id);
        return huirenshen;
    }

    @Override
    public String updateZhuYuanId(Huiji huiji) {
        zxhdao.updateZhuYuanId(huiji);
        return "success";
    }

    @Override
    public String updateRenZhenId(Huirenshen huirenshen) {
        zxhdao.updateRenZhenId(huirenshen);
        return "success";
    }

    @Override
    public String updateRenQuanId(Huirenshen huirenshen) {
        zxhdao.updateRenQuanId(huirenshen);
        return "success";
    }

    @Override
    public String updateJineId(Huijin huijin, String addr) {
        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        zxhdao.updateJineId(huijin);
        Jine jine = new Jine();
        jine.setJinnumber(huijin.getHuijinmoneysl());
        jine.setJindate(sim.format(new Date()));
        jine.setJinid(huijin.getHuijinid());
        jine.setJinip(addr);
        jine.setJindis(huijin.getHuijinshuiming());
        zxhdao.insertJine(jine);
        return "success";
    }

    @Override
    public List<Map<String, Object>> queryzijin(String jindis, String jinnumber) {
        List<Map<String, Object>> list = zxhdao.queryzijin(jindis,jinnumber);
        return list;
    }
}
