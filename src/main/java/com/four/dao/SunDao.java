package com.four.dao;

import com.four.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface SunDao {
    @Select("select * from t_orientation")
    List<Orientation> queryOrientation();
    @Select("select max(xuhao)+1 from t_orientation")
    Integer queryxuhao();
    @Insert("INSERT INTO T_ORIENTATION(NAME,XUHAO,CREATEDATE) VALUES(#{ori   .name},#{ori.xuhao},#{ori.createdate})")
    void addchaoxiangSS(@Param("ori") Orientation orientation);
    @Delete("delete from t_orientation where id=#{id}")
    void deleteditie1(Integer id);
    @Delete("delete from t_orientation where id=#{ids}")
    void deleteidspishan(String id);
    @Select("select * from t_orientation where id=#{id}")
    Orientation updatechaoxianghui(Integer id);
    @Update("update t_orientation set name=#{name},xuhao=#{xuhao} where id=#{id}")
    void updatechaoxianggai(Orientation orientation);
    @Select("select * from t_situation")
    List<Situation> querySituation();
    @Select("select max(xuhao)+1 from t_situation")
    Integer queryxuhao2();
    @Insert("INSERT INTO T_SITUATION(NAME,XUHAO,CREATEDATE) VALUES(#{ors.name},#{ors.xuhao},#{ors.createdate})")
    void addqingkuangSS(@Param("ors") Situation situation);
    @Delete("delete from t_situation where id=#{id}")
    void deleteQingKuang(Integer id);
    @Select("select * from t_situation where id=#{id}")
    Situation updateqingkuanghui(Integer id);
    @Update("update t_situation set name=#{name},xuhao=#{xuhao} where id=#{id}")
    void updateqingkuanggai(Situation situation);
    @Delete("delete from t_situation where id=#{ids}")
    void deleteidspishan2(String s);
    @Select("select * from huiji a,huijin b,huizcxz c where a.huijinid=b.huijinid and a.huijizhucexz=c.huizcxzid and c.huizcxzid=4")
    List<Map<Object,String>> queryzhongjie();
   /* @Select("select * from huiji a,huijin b, huizcxz c where c.huizcxzid=4")
    List<Map<Object,String>> queryzhongjie();
    @Select("select * from huiji a,huijin b, huizcxz c where c.huizcxzid=#{id}")
    Huiji updatesyhyhuicha1(@Param("id") String id);
    @Select("select * from t_area where pid=#{id}")
    List<Area> querydreadifangid1(@Param("id") String id);
    @Select("select * from huideng")
    List<Huideng> queryhydj();
    @Select("select * from t_area where pid=0")
    List<Area> querydrea();
    @Update("update huiji set  huijipass=#{hjj.huijipass}, huijilianxiren=#{hjj.huijilianxiren}, huijiyouxiang=#{hjj.huijiyouxiang}, huijinicheng=#{hjj.huijinicheng}, huijishifoubyx=#{hjj.huijishifoubyx}, huijishifoubsj=#{hjj.huijishifoubsj}, huijishouji=#{hjj.huijishouji}, huijidianhua=#{hjj.huijidianhua}, huijiqq=#{hjj.huijiqq}, huijiquyu=#{hjj.huijiquyu}, huijiquyudf=#{hjj.huijiquyudf}, huijitouxiang=#{hjj.huijitouxiang},huijierweima=#{hjj.huijierweima}, huijimendiandz=#{hjj.huijimendiandz}, huijizhongjiemc=#{hjj.huijizhongjiemc}, huijizwojsgc=#{hjj.huijizwojsgc}, huijidituzb=#{hjj.huijidituzb}, huijidpgjc=#{hjj.huijidpgjc}, huijinid=#{hjj.huijinid}, huisysxl=#{hjj.huisysxl}, huiquanxian=#{hjj.huiquanxian}, huidjdqdate=#{hjj.huidjdqdate},huidengid=#{hjj.huidengid} where huijiid=#{hjj.huijiid}")
        void updatesyhygai(@Param("hjj") Huiji hjj);
    @Select("select * from huirenzhuang b,huiji a where b.huirenid=a.huijiid and b.huirenid=#{id}")
    Huirenzhuang queryhuiyuanrenzhneg(String id);*/
}

