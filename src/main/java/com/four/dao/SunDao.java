package com.four.dao;

import com.four.entity.Orientation;
import com.four.entity.Situation;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface SunDao {
    @Select("select * from t_orientation")
    List<Orientation> queryOrientation();
    @Select("select max(xuhao)+1 from t_orientation")
    Integer queryxuhao();
    @Insert("INSERT INTO T_ORIENTATION(NAME,XUHAO,CREATEDATE) VALUES(#{ori.name},#{ori.xuhao},#{ori.createdate})")
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
}

