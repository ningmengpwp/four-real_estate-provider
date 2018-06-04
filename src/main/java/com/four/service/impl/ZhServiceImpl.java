package com.four.service.impl;

import com.four.dao.Zhdao;
import com.four.entity.*;
import com.four.mysqlzc.ReadOnlyConnection;
import com.four.service.ZhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ZhServiceImpl implements ZhService {

    @Autowired
    private Zhdao zhdao;

//************公交信息**********************************************************************
@ReadOnlyConnection
 @Override
    public List<Public>  queryBus() {
        return zhdao.queryBus();
    }

   @Override
    public void delbus(Integer id) {
        zhdao.delbus(id);
    }

   @Override
    public Public updatehx(Integer id) {
        return  zhdao.updatehx(id);
    }

  @Override
    public void upbus(Public bus) {

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      bus.setCreatedate(sdf.format(new Date()));

        zhdao.upbus(bus);
    }

    @ReadOnlyConnection
    @Override
    public Integer queryxuhao() {

        return zhdao.queryxuhao();
    }

    @Override
    public void addbus(Public bus) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        bus.setCreatedate(sdf.format(new Date()));
        zhdao.addbus(bus);
    }

    @Override
    public void deleteAllBus(String id) {
        zhdao.deleteAllBus(id);
    }

//********配套信息********************************************************************************

    @ReadOnlyConnection
    @Override
    public List<Mating> queryPeiTao() {
        return zhdao.queryPeiTao();
    }

    @Override
    public void delpeitao(Integer id) {

         zhdao.delpeitao(id);
    }

    @Override
    public void delallpeitao(String id) {

        zhdao.delallpeitao(id);
    }

    @Override
    public void addpeitao(Mating mating) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mating.setCreatedate(sdf.format(new Date()));

        zhdao.addpeitao(mating);
    }

    @ReadOnlyConnection
    @Override
    public List<Apartment> queryxuhaochushou() {
        return zhdao.queryxuhaochushou();
    }

    @ReadOnlyConnection
    @Override
    public List<Apartment> queryxuhaochuzu() {
        return zhdao.queryxuhaochuzu();
    }

    @ReadOnlyConnection
    @Override
    public Integer queryxuhaoP() {
        return zhdao.queryxuhaoP();
    }

    @ReadOnlyConnection
    @Override
    public Mating queryByIdpeitao(Integer id) {
        return zhdao.queryByIdpeitao(id);
    }

    @Override
    public void updatePeiTao(Mating peitao) {
        zhdao.updatePeiTao(peitao);
    }

    //***********建材中心信息**********************************************************************************************************
    @ReadOnlyConnection
    @Override
    public List<Map<String, Object>> queryJianCai() {
        return zhdao.queryJianCai();
    }

    @Override
    public void delallJIan(String id) {
        zhdao.delallJIan(id);
    }

    @ReadOnlyConnection
    @Override
    public List<Map<String, Object>> queryQuizu(Integer wuyeid, String biaoti) {
        return zhdao.queryQuizu(wuyeid,biaoti);
    }

    @Override
    public void deletechuzuAll(String qiugouid){
         zhdao.deletechuzuAll(qiugouid);
    }

    @Override
    public void updateChuZuChuId(String qiugouid) {
         zhdao.updateChuZuChuId(qiugouid);
    }

    @ReadOnlyConnection
    @Override
    public void updateDownChuId(String qiugouid) {
        zhdao.updateDownChuId(qiugouid);
    }

    @Override
    public List<Map<String, Object>> updateChuZu(Integer qiugouid) {
        return zhdao.updateChuZu(qiugouid);
    }

    @Override
    public void updateQiuZu(t_qiugougl quizu) {
        zhdao.updateQiuZu(quizu);
    }

    @Override
    public void updatechuJiaIds(Integer flag, Integer ids) {

        zhdao.updatechuJiaIds(flag,ids);
    }

    @Override
    public void updateShenHheChuIds(Integer flag, Integer ids) {
        zhdao.updateShenHheChuIds(flag,ids);
    }

    @ReadOnlyConnection
    @Override
    public List<Map<String, Object>> queryQuiGou(Integer wuyeid, String biaoti) {
        return zhdao.queryQuiGou(wuyeid,biaoti);
    }
//**********求购房源信息***************************************************************************************************************
}
