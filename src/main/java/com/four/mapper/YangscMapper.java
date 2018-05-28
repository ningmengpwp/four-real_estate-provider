package com.four.mapper;

import com.four.entity.Area;
import com.four.entity.Jurisdiction;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface YangscMapper {
    @Insert("insert  into t_area values(id,#{name},#{pid},#{xuhao},#{createdate},#{shouzimu},#{zuobiao}" +
            ",#{hotstatus})")
    void addqvyv(Area area);
    @Select("select min(a.pid) from t_area a ")
    Integer queryqvyvminid();

    @Select("select * from t_area a where   a.pid=#{pid} order by a.xuhao")
     List<Area> queryList(@Param("pid") Integer id);

    @Delete("delete from t_area where id in(#{ids}) or pid in(#{ids})")
    void deleteqvyv(@Param("ids") String ids);
    @Select("select * from t_area a where   a.id=#{id}")
    Area queryqvyv(@Param("id") Integer id);
    @Update("update t_area a  set a.name=#{name},a.pid=#{pid},a.xuhao=#{xuhao},a.createdate=" +
            "#{createdate},a.shouzimu=#{shouzimu},a.zuobiao=#{zuobiao},a.hotstatus=#{hotstatus} " +
            "where a.id=#{id}")
    void updateqvyv(Area area);
    @Select("select  *  from t_user u,t_jurisdiction qx,t_JUzj zj where u.userid=zj.userid and " +
            " zj.qid=qx.qid and u.userid=#{userid}")
     List<Map<String,Object>> queryQuxan(@Param("userid") Integer userid);
}