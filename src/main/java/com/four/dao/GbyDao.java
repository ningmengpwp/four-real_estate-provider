package com.four.dao;

import com.four.entity.Apartment;
import com.four.entity.Feature;
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
    @Select("select * from huiji h")
    List<Map<String,Object>> queryjingji();
}
