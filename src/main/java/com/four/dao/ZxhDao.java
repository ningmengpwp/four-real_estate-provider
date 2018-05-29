package com.four.dao;

import com.four.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface ZxhDao {
    @Select("SELECT * FROM T_MEMBER M ORDER BY M.PAIXU")
    List<Member> selectHui();

    @Select("SELECT * FROM T_USER U WHERE U.USERID=#{userid}")
    User queryUser(@Param("userid") Integer userid);

    @Update("UPDATE T_USER U SET U.USERPASS=#{userpass} WHERE U.USERID=#{userid}")
    void updatePass(@Param("userid") Integer userid,@Param("userpass") String userpass);

    @Select("SELECT MAX(M.PAIXU) FROM T_MEMBER M")
    Integer selectMaxXu();

    @Insert("INSERT INTO T_MEMBER(NAME,CREATEDATE,NIANPRICE,SHUACOUNT,FACOUNT,PAIXU) " +
            "VALUE(#{mem.name},#{mem.createdate},#{mem.nianprice},#{mem.shuacount},#{mem.facount},#{mem.paixu})")
    void insertMem(@Param("mem") Member member);

    @Select("SELECT * FROM T_MEMBER M WHERE M.ID=#{id}")
    Member selectMemId(@Param("id") Integer id);

    @Update("UPDATE T_MEMBER M SET M.NAME=#{mem.name},M.CREATEDATE=#{mem.createdate},M.NIANPRICE=#{mem.nianprice}," +
            "M.SHUACOUNT=#{mem.shuacount},M.FACOUNT=#{mem.facount},M.PAIXU=#{mem.paixu} WHERE M.ID=#{mem.id}")
    void updateHuiId(@Param("mem") Member member);

    @Delete("DELETE FROM T_MEMBER WHERE ID=#{id}")
    void deleteMemId(@Param("id") Integer id);

    @Delete("DELETE FROM T_MEMBER WHERE ID IN (${ids})")
    void deleteAllIds(@Param("ids") String ids);

    @Select("select b.id,b.name,b.createdate,b.guancount,a.name as areaname " +
            "from t_business b,t_area a where b.areaid=a.id")
    List<Map<String,Object>> selectShang();

    @Select("SELECT * FROM T_AREA A WHERE A.PID=0")
    List<Area> queryAreall();

    @Insert("INSERT INTO T_BUSINESS(NAME,GUANCOUNT,CREATEDATE,AREAID,PHOTO,TEXTAREA)" +
            "VALUE(#{bu.name},#{bu.guancount},#{bu.createdate},#{bu.areaid},#{bu.photo},#{bu.textarea})")
    void insertBusin(@Param("bu") Business business);

    @Delete("DELETE FROM T_BUSINESS WHERE ID=#{id}")
    void deleteShangId(@Param("id") String id);

    @Delete("DELETE FROM T_BUSINESS WHERE ID IN (${ids})")
    void deleteBusall(@Param("ids") String ids);

    @Select("SELECT * FROM T_BUSINESS B WHERE B.ID=#{id}")
    Business selectBusId(@Param("id") Integer id);

    @Update("UPDATE T_BUSINESS B SET B.NAME=#{bus.name},B.GUANCOUNT=#{bus.guancount},B.CREATEDATE=#{bus.createdate}," +
            "B.AREAID=#{bus.areaid},B.PHOTO=#{bus.photo},B.TEXTAREA=#{bus.textarea} WHERE B.ID=#{bus.id}")
    void updateBusId(@Param("bus") Business business);

    @Select("SELECT cl.*,cc.name as zname FROM T_CONSULTINGLIST cl,T_CONSULTINGCONTENT cc "+
                   "WHERE CL.ZID = CC.ID")
    List<Map<String,Object>> selectZiXun();

    @Delete("DELETE FROM T_CONSULTINGLIST WHERE ID=#{id}")
    void deleteZiId(@Param("id") String id);

    @Insert("insert into T_CONSULTINGLIST(name,zid,jiacu,color,author,laiyuan,wangzhi,photoimg,description,seozi,seodescription,createdate,dianlu,fanuhuiyuan,toutiao,shouye,shenhe) " +
            "value(#{con.name},#{con.zid},#{con.jiacu},#{con.color},#{con.author},#{con.laiyuan},#{con.wangzhi}," +
            "#{con.photoimg},#{con.description},#{con.seozi},#{con.seodescription},#{con.createdate},#{con.dianlu},#{con.fanuhuiyuan},#{con.toutiao},#{con.shouye},#{con.shenhe})")
    void insertZixun(@Param("con") Consultinglist consultinglist);

    @Select("SELECT * FROM T_CONSULTINGCONTENT")
    List<Consultingcontent> selectConsultall();

    @Select("SELECT * FROM T_ADVISORY")
    List<Advisory> selectAdvall();

    @Delete("DELETE FROM T_CONSULTINGLIST WHERE ID IN (${ids})")
    void deleteZixall(String ids);

    @Update("UPDATE T_CONSULTINGLIST SET SHENHE=#{flag} WHERE ID IN (${ids})")
    void updateShenz(@Param("flag") Integer flag,@Param("ids") String ids);

    @Select("SELECT * FROM T_CONSULTINGLIST C WHERE C.ID=#{id}")
    Consultinglist selectQueryId(@Param("id") Integer id);

    @Update("UPDATE T_CONSULTINGLIST SET NAME=#{con.name},ZID=#{con.zid},JIACU=#{con.jiacu},COLOR=#{con.color},AUTHOR=#{con.author},LAIYUAN=#{con.laiyuan},WANGZHI=#{con.wangzhi},PHOTOIMG=#{con.photoimg}," +
            "DESCRIPTION=#{con.description},SEOZI=#{con.seozi},SEODESCRIPTION=#{con.seodescription},CREATEDATE=#{con.createdate},DIANLU=#{con.dianlu},FANUHUIYUAN=#{con.fanuhuiyuan}," +
            "TOUTIAO=#{con.toutiao},SHOUYE=#{con.shouye},SHENHE=#{con.shenhe} where ID=#{con.id}")
    void updateZiId(@Param("con") Consultinglist consultinglist);

    @Select("SELECT cl.*,cc.name as zname FROM T_CONSULTINGLIST cl,T_CONSULTINGCONTENT cc "+
            "WHERE CL.ZID = CC.ID AND CL.SHENHE = 2")
    List<Map<String,Object>> selectShenZiXun();

    @Delete("DELETE FROM T_HOUSING WHERE ID=#{id}")
    void deleteYuanId(@Param("id") Integer id);

    @Delete("DELETE FROM T_HOUSING WHERE ID IN (${ids})")
    void deleteIdAll(@Param("ids") String ids);

    @Update("UPDATE T_HOUSING WHERE RECOMMENDED=1 WHERE ID IN (${ids})")
    void updateYuanChuId(@Param("ids") String ids);

    @Update("UPDATE T_HOUSING WHERE RECOMMENDED=2 WHERE ID IN (${ids})")
    void updateDownChuId(@Param("ids") String ids);

    @Select("SELECT * FROM T_HOUSING H,T_APARTMENT A WHERE H.WUID=A.ID")
    List<Map<String,Object>> selectFangyuan();

    @Select("SELECT * FROM T_APARTMENT A WHERE A.XIAOZU LIKE '%1%'")
    List<Apartment> queryApart();

    @Select("SELECT * FROM HUIJI A,HUIJIN B,HUIZCXZ C WHERE A.HUIJINID=B.HUIJINID AND A.HUIJIZHUCEXZ=C.HUIZCXZID AND C.HUIZCXZID=6")
    List<Map<String,Object>> queryZhuang();

    @Delete("DELETE FROM HUIJIN WHERE HUIJIID in (${ids})")
    void deleteZhuangIdAll(@Param("ids") String ids);

    @Select("SELECT * FROM HUIJI H WHERE H.HUIJIID=#{id}")
    Huiji selectZhuId(@Param("id") String id);

    @Delete("DELETE FROM HUIJIN WHERE HUIJINID=#{huijinid}")
    void deleteZhuId(@Param("huijinid") Integer huijinid);

    @Select("SELECT * FROM HUIQUAN WHERE HUILEI LIKE '%6%'")
    List<Huiquan> selectQuan();

    @Select("SELECT * FROM HUIJI A,HUIJIN B,HUIZCXZ C WHERE A.HUIJINID=B.HUIJINID AND A.HUIJIZHUCEXZ=C.HUIZCXZID AND A.HUIJIID=#{id}")
    Huiji selectXiuId(@Param("id") Integer id);

    @Select("SELECT * FROM HUIRENSHEN H WHERE H.HUIRENSHENZH=2")
    Huirenshen selectQueRen(@Param("id") Integer id);

    @Update("UPDATE HUIJI SET HUIJIZHANGHAO=#{hu.huijizhanghao},HUIJIPASS=#{hu.huijipass},HUIJILIANXIREN=#{hu.huijilianxiren},HUIJIYOUXIANG=#{hu.huijiyouxiang},HUIJISHIFOUBYX=#{hu.huijishifoubyx},HUIJISHIFOUBSJ=#{hu.huijishifoubsj}," +
            "HUIJISHOUJI=#{hu.huijishouji},HUIJITOUXIANG=#{hu.huijitouxiang},HUIJIDIANHUA=#{hu.huijidianhua},HUIJIQQ=#{hu.huijiqq},HUIJIQUYU=#{hu.huijiquyu},HUIJINID=#{hu.huijinid},HUIDENGID=#{hu.huidengid},HUISYSXL=#{hu.huisysxl},HUIQUANXIAN=#{hu.huiquanxian}," +
            "HUIDJDQDATE=#{hu.huidjdqdate},HUIGUANID=#{hu.huiguanid},HUIGUANTUIPAI=#{hu.huiguantuipai},HUIGUANDIAN=#{hu.huiguandian},DPGUANJIANC=#{hu.dpguanjianc},DPMIAOSHU=#{hu.dpmiaoshu},HUIZHI=#{hu.huizhi},HUISICHENG=#{hu.huisicheng},HUISIDIS=#{hu.huisidis}," +
            "HUIJIQUYUDF=#{hu.huijiquyudf} WHERE HUIJIID=#{hu.huijiid}")
    void updateZhuYuanId(@Param("hu") Huiji huiji);

    @Update("UPDATE HUIRENSHEN SET HUIRENSHENSFZ=#{huirenshensfz},HUIRENSHENNAME=#{huirenshenname},HUIRENSHENSFZH=#{huirenshensfzh},HUIRENSHENIMGZHNG=#{huirenshenimgzhng}," +
            "HUIRENSHENIMGFAN=#{huirenshenimgfan} WHERE HUIRENSHENID=#{huirenshenid}")
    void updateRenZhenId(Huirenshen huirenshen);

    @Update("UPDATE HUIRENSHEN SET HUIRENSHEN=#{huirenshen},HUIRENMING=#{huirenming},HUIRENNUMBER=#{huirennumber},HUIRENPHOTO=#{huirenphoto},HUIRENJJYY=#{huirenjjyy}" +
            " WHERE HUIRENSHENID=#{huirenshenid}")
    void updateRenQuanId(Huirenshen huirenshen);

    @Update("update huijin set huijinkymoney=${huijinkymoney}+${huijinmoneysl} where huijinid=#{huijinid}")
    void updateJineId(Huijin huijin);

    @Insert("insert into t_jine(jinid,jinnumber,jindis,jindate,jinip) VALUES(#{in.jinid},#{in.jinnumber},#{in.jindis},#{in.jindate},#{in.jinip})")
    void insertJine(@Param("in") Jine jine);
}
