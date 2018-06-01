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

     @Select("SELECT * FROM HUIJI A,HUIJIN B,HUIZCXZ C WHERE A.HUIJINID=B.HUIJINID AND A.HUIJIZHUCEXZ=C.HUIZCXZID AND C.HUIZCXZID=3")
     List<Map<String,Object>>  queryJianCai();

    @Delete("delete from huijin where id in(${ida}) ")
     void delallJIan(@Param("ida") String id);

 //***********房源求租信息**********************************************************************************************************


     @Select("<script>"+
         "select * from t_qiugougl tq,t_apartment ap,t_fysh tf " +
         "<where>" +
         "tq.wuyeid=ap.id and " +
         "tq.gouorzu=1 and " +
         "tq.fyshid=tf.fyshztid " +
         "<if test=' wuyeid !=null || \"\".equals(wuyeid) '>" +
         "and tq.wuyeid=#{wuyeid}" +
         "</if>" +
         "<if test='biaoti !=null || \"\".equals(biaoti) '>" +
         "and tq.biaoti like '%${biaoti}%'" +
         "</if>" +
         "</where>" +
         "</script>")
      List<Map<String,Object>> queryQuizu(@Param("wuyeid") Integer wuyeid, @Param("biaoti") String biaoti);

      @Delete("DELETE FROM T_QIUGOUGL WHERE QIUGOUID IN (${ids})")
      void deletechuzuAll(@Param("ids") String qiugouid);

      @Update("UPDATE T_QIUGOUGL SET TUIJIAN=1 WHERE QIUGOUID IN (${id})")
      void updateChuZuChuId(@Param("id") String qiugouid);

      @Update("UPDATE T_QIUGOUGL SET TUIJIAN=2 WHERE QIUGOUID IN (${ids})")
      void updateDownChuId(@Param("ids") String qiugouid);

      @Select("select *  from t_qiugougl tq,t_apartment ap,t_fysh tf  where tq.wuyeid=ap.id  and tq.fyshid=tf.fyshztid and  tq.qiugouid=#{qiugouid}")
      List<Map<String,Object>> updateChuZu(Integer qiugouid);

      @Select("select * from t_area where pid=0")
      String queryarea();



     @Update(" update t_qiugougl set fyshid=#{fyshid},qiugouzdxh=#{qiugouzdxh},qiugoufbhy=#{qiugoufbhy}," +
             "qiugoudate=#{qiugoudate},lianxiren=#{lianxiren},lianxihaoma=#{lianxihaoma}," +
             "tuijian=#{tuijian},shangxiajia=#{shangxiajia},miaoshu=#{miaoshu},mianjiyaoqius=#{mianjiyaoqius},mianjiyaoqiue=#{mianjiyaoqiue}," +
             "feiyongyusuans=#{feiyongyusuans},feiyongyusuane=#{feiyongyusuane},quyupid=#{quyupid},biaoti=#{biaoti},wuyeid=#{wuyeid} " +
             "where qiugouid=#{qiugouid} ")
     void updateQiuZu(t_qiugougl quizu);

     @Update("UPDATE T_QIUGOUGL SET SHANGXIAJIA=#{flag} WHERE QIUGOUID IN (${ids})")
     void updatechuJiaIds(@Param("flag") Integer flag, @Param("ids") Integer ids);

     @Update("UPDATE T_QIUGOUGL SET FYSHID=#{flag} WHERE QIUGOUID IN (${ids})")
     void updateShenHheChuIds(@Param("flag") Integer flag, @Param("ids") Integer ids);

 //**********求购房源信息***************************************************************************************************************

      @Select("<script>" +
         "select * from t_qiugougl tq,t_apartment ap,t_fysh tf " +
         "<where>" +
         "tq.wuyeid=ap.id and " +
         "tq.gouorzu=2 and " +
         "tq.fyshid=tf.fyshztid " +
         "<if test=' wuyeid !=null || \"\".equals(wuyeid) '>" +
         "and tq.wuyeid=#{wuyeid}" +
         "</if>" +
         "<if test='biaoti !=null || \"\".equals(biaoti) '>" +
         "and tq.biaoti like '%${biaoti}%'" +
         "</if>" +
         "</where>" +
         "</script>")
 List<Map<String,Object>> queryQuiGou(@Param("wuyeid") Integer wuyeid, @Param("biaoti") String biaoti);


}

