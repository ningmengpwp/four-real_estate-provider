package com.four.service;

import com.four.entity.*;

import java.util.List;
import java.util.Map;

public interface ZhService {

//************公交信息**********************************************************************

    List<Public>  queryBus();

    void delbus(Integer id);

    Public updatehx(Integer id);

    void upbus(Public bus);

  Integer queryxuhao();

   void addbus(Public bus);

    void deleteAllBus(String id);

//********配套信息********************************************************************************

    List<Mating> queryPeiTao();

    void delpeitao(Integer id);

    void delallpeitao(String id);

    void addpeitao(Mating mating);

    List<Apartment> queryxuhaochushou();

    List<Apartment> queryxuhaochuzu();

    Integer queryxuhaoP();

    Mating queryByIdpeitao(Integer id);

    void updatePeiTao(Mating peitao);

    //***********建材中心信息**********************************************************************************************************

    List<Map<String,Object>> queryJianCai();

    void delallJIan(String id);

    //***********房源求租信息**********************************************************************************************************

    List<Map<String,Object>> queryQuizu(Integer wuyeid, String biaoti);

    void deletechuzuAll(String qiugouid);

    void updateChuZuChuId(String qiugouid);

    void updateDownChuId(String qiugouid);

    List<Map<String,Object>> updateChuZu(Integer qiugouid);

    void updateQiuZu(t_qiugougl quizu);

    void updatechuJiaIds(Integer flag, Integer ids);

    void updateShenHheChuIds(Integer flag, Integer ids);

//**********求购房源信息***************************************************************************************************************

    List<Map<String,Object>> queryQuiGou(Integer wuyeid, String biaoti);





}
