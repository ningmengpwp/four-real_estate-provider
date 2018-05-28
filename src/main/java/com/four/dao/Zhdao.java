package com.four.dao;

import com.four.entity.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface Zhdao {

 //************公交信息**********************************************************************

   @Select("select * from t_public ")
    List<Public>  queryBus();

   @Delete(" delete from t_public where id=#{id} ")
    void delbus(Integer id);

    @Select("select * from t_public  where id=#{id} ")
    Public updatehx(Integer id);

    @Update("update t_public set name=#{bus.name},xuhao=#{bus.xuhao},createdate=#{bus.createdate} where id=#{bus.id}")
    void upbus(@Param("bus") Public bus);

    @Insert("insert into t_public values(id,#{name},#{xuhao},#{createdate})")
    void addbus(Public bus);

    @Select(" select Max(xuhao)+1 from t_public ")
    Integer queryxuhao();

    @Delete("delete from t_public where id in(${ids}) ")
    void deleteAllBus(@Param("ids") String id);

 //********配套信息********************************************************************************

     @Select("select * from t_mating ")
     List<Mating> queryPeiTao();

     @Delete(" delete from t_mating where id=#{id} ")
     void delpeitao(Integer id);

     @Delete("delete from t_mating where id in(${idss}) ")
     void delallpeitao(@Param("idss") String id);

     @Insert("insert into t_mating values(id,#{name},#{sell},#{rentout},#{xuhao},#{createdate})")
     void addpeitao(Mating mating);

     @Select("select  * from t_apartment where xiaozu LIKE '%2%'")
     List<Apartment> queryxuhaochushou();

     @Select("select * from t_apartment where xiaozu LIKE '%1%'")
     List<Apartment> queryxuhaochuzu();

     @Select(" select Max(xuhao)+1 from t_mating ")
     Integer queryxuhaoP();

     @Select("select * from t_mating where id=#{id}")
     Mating queryByIdpeitao(Integer id);

     @Update("update t_mating set name=#{peitao.name},sell=#{peitao.sell},rentout=#{peitao.rentout},xuhao=#{peitao.xuhao},createdate=#{peitao.createdate} where id=#{peitao.id}")
     void updatePeiTao(@Param("peitao") Mating peitao);

    //***********建材中心信息**********************************************************************************************************

     @Select("select m.huijinid as huijinid , m.huijindate as huijindate ,m.huijinip as huijinip,m.huijinkymoney as huijinkymoney,j.huijizhanghao as  huijizhanghao ,j.huijizhucexz as huijizhucexz ,j.huijinicheng as huijinicheng  from  huijin m, huiji j where m.huijinid=j.huijiid")
     List<Map<String,Object>>  queryJianCai();

    @Delete("delete from huijin where id in(${ida}) ")
     void delallJIan(@Param("ida") String id);

    @Select(" select *  from huirenshen  where  huirenshenid=#{huirenshenid}")
    Huirenshen renzhengByIdjc(Integer huirenshenid);





}

