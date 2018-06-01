package com.four.dao;

import com.four.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface GbyDao {

    @Select("select * from t_apartment t order by  t.xuhao  asc ")
    List<Apartment> queryApartment();
    @Select("select count(xuhao) from t_apartment")
    Integer querycount();
    @Insert("insert into t_apartment(id,yuanname,zhanname,xuhao,xiaozu,statusup,photoimg) values(id,#{yuanname},#{zhanname},#{xuhao},#{xiaozu},#{statusup},#{photoimg})")
    void addApartment(Apartment apartment);
    @Delete("delete from t_apartment where id=#{id}")
    void deleteApartment(Integer id);
    @Select("select * from t_apartment where id=#{id} ")
    Apartment queryById(Integer id);
    @Update("update t_apartment set yuanname=#{yuanname},zhanname=#{zhanname},xuhao=#{xuhao},xiaozu=#{xiaozu},statusup=#{statusup},photoimg=#{photoimg} where id=#{id}")
    void updateApartment(Apartment apartment);
    @Select("select * from t_feature t order by  t.xuhao  asc")
    List<Feature> queryFeature();
    @Select("select count(xuhao) from t_feature")
    Integer querycount1();
    @Select("select * from t_apartment a where a.xiaozu like '%1%'")
    List<Apartment> queryApartment1();
    @Select("select * from t_apartment b where b.xiaozu like '%2%'")
    List<Apartment> queryApartment2();
    @Insert("insert into t_feature(id,name,sell,rendout,programa,xuhao,createdate) values(id,#{name},#{sell},#{rendout},#{programa},#{xuhao},#{createdate})")
    void addFeature(Feature feature);
    @Delete("delete from t_feature where id=#{id}")
    void deleteFeature(Integer id);
    @Delete("delete from t_feature where id in(${ids})")
    void deleteswuyetese(@Param("ids") String ids);
    @Select("select * from t_feature where id=#{id}")
    Feature queryByIdwuyetese(Integer id);
    @Update("update t_feature set name=#{name},sell=#{sell},rendout=#{rendout},programa=#{programa},xuhao=#{xuhao} where id=#{id}")
    void updatewuyetese(Feature feature);
    @Select("select * from huiji a,huijin b,huizcxz c where a.huijinid=b.huijinid and a.huijizhucexz=c.huizcxzid  and c.huizcxzid=2 ")
    List<Map<Object,String>> queryjingji();
    @Select("select * from huiji a,huijin b,huizcxz c where a.huijinid=b.huijinid and a.huijizhucexz=c.huizcxzid and a.huijiid=#{id}")
    Huiji updatesyhyhuicha(@Param("id")String id);
    @Select("select * from huideng")
    List<Huideng> queryhydj();
    @Select("select * from t_area where pid=0")
    List<Area> querydrea();
    @Select("select * from t_area where pid=#{id}")
    List<Area> querydreadifangid(String id);
    @Update("update huiji set  huijipass=#{huijipass}, huijilianxiren=#{huijilianxiren}, huijiyouxiang=#{huijiyouxiang}, huijinicheng=#{huijinicheng}, huijishifoubyx=#{huijishifoubyx}, huijishifoubsj=#{huijishifoubsj}, huijishouji=#{huijishouji}, huijidianhua=#{huijidianhua}, huijiqq=#{huijiqq}, huijiquyu=#{huijiquyu}, huijiquyudf=#{huijiquyudf}, huijitouxiang=#{huijitouxiang},huijierweima=#{huijierweima}, huijimendiandz=#{huijimendiandz}, huijizhongjiemc=#{huijizhongjiemc}, huijizwojsgc=#{huijizwojsgc}, huijidituzb=#{huijidituzb}, huijidpgjc=#{huijidpgjc}, huijinid=#{huijinid}, huisysxl=#{huisysxl}, huiquanxian=#{huiquanxian}, huidjdqdate=#{huidjdqdate},huidengid=#{huidengid} where huijiid=#{huijiid}")
    void updatesyhygai(Huiji hj);
    @Select("<script>" +
            "select  * from t_chuzugl c,t_apartment a,  t_fysh f, t_storetype s " +
            "<where>" +
            " c.chuzuid=a.id and " +
            "c.chuzushzt=f.fyshztid and " +
            "c.shangpulxid=s.id "+
            "<if test=' wuyeid !=null || \"\".equals(wuyeid) '>" +
            "and c.wuyeid=#{wuyeid}" +
            "</if>" +
            "<if test='chuzuname !=null || \"\".equals(chuzuname) '>" +
            "and c.chuzuname like '%${chuzuname}%'" +
            "</if>" +
            "</where>" +
            "</script>")
    List<Map<String,Object>> querychuzu(@Param("wuyeid") Integer wuyeid,@Param("chuzuname") String chuzuname);
    @Select("SELECT * from t_chuzugl c ,t_storetype s WHERE c.chuzuid=s.id and c.chuzuid=#{id}")
    List<Map<String,Object>> querychuzuxx(Integer id);
    @Select("select * from t_public ")
    List<Public> querygongjiao();
    @Select("select * from t_metro ")
    List<Metro> queryditie();
    @Select("select * from t_feature ")
    List<Feature> querywuye();
    @Select("select * from t_mating ")
    List<Mating> querypeitao();
    @Select("select * from t_retailindustry ")
    List<Retailindustry> queryhangye();
    @Select("select * from t_storetype ")
    List<Storetype> querypumian();
    @Select("select * from t_pavementtype ")
    List<Pavenmenttype> querypumian1();
    @Select("select * from t_situation ")
    List<Situation> queryfangwu();
    @Select("select * from t_orientation ")
    List<Orientation> querychaoxiang();
    @Select("select * from t_chuzugl where chuzuid=#{id}")
    t_chuzugl queryByIdchuzu(Integer id);
    @Update("update t_chuzugl set chuzuname=#{chuzuname},zdybianhao=#{zdybianhao},chuzumianji=#{chuzumianji}," +
            "chuzuzujin=#{chuzuzujin},chuzuzrf=#{chuzuzrf},chuzufs=#{chuzufs}," +
            "chuzuszxq=#{chuzuszxq},chuzulouc=#{chuzulouc},chuzuqypid=#{chuzuqypid},chuzuwz=#{chuzuwz}" +
            ",chuzuxgt=#{chuzuxgt},gongjiaoid=#{gongjiaoid}," +
            "ditieid=#{ditieid},hangyelxid=#{hangyelxid},wuyefei=#{wuyefei}," +
            "fwqkid=#{fwqkid},wytsid=#{wytsid},pzssid=#{pzssid}," +
            "chuzujjdm=#{chuzujjdm},zhuzuspdz=#{zhuzuspdz},chuzuxxms=#{chuzuxxms}," +
            "chuzusxj=#{chuzusxj},chuzucctj=#{chuzucctj},chuzulxr=#{chuzulxr}," +
            "chuzulxhm=#{chuzulxhm},chuzufbhy=#{chuzufbhy},chuzutjxh=#{chuzutjxh}," +
            "chuzuzdxh=#{chuzuzdxh},chuzushzt=#{chuzushzt} where chuzuid=#{chuzuid}")
    void updatechuzu(t_chuzugl chuzugl);
    @Select("select t.chuzuid,t.chuzusxj from  t_chuzugl t where t.chuzuid in(${id})")
    List<Map<String,Object>> queryShX(String id);
    @Update(" update t_chuzugl set  chuzusxj=2  where chuzuid=${idd}")
    void updateShang(Object chuzuid);
    @Update(" update t_chuzugl set  chuzusxj=1  where chuzuid =${iddd}")
    void updateXia(Object chuzuid);
    @Update("update t_chuzugl c set c.fyshid=${zt} where c.chuzuid in(${ids})")
    void updateBinG(String ids, Integer zt);
    @Delete("DELETE FROM t_chuzugl WHERE chuzuid in(${ids})")
    void deleteschuzu(String ids);
    @Update(" update t_chuzugl c set c.chuzucctj=0 where c.chuzuid in (${ids})")
    void updatechutuidw(String ids);
    @Update(" update t_chuzugl c set c.chuzucctj=1 where c.chuzuid in (${ids})")
    void updateqxchutuidw(String ids);
}
