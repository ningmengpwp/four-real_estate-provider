package com.four.mapper;

import com.four.entity.*;
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

    @Select("<script>"+
           "select * from huiji ji,huijin  jin,huizcxz xz" +
            " where ji.huijinid=jin.huijinid and ji.huijizhucexz=xz.huizcxzid "+
            " <if test='zhang!=null &amp;&amp; !\"\".equals(zhang)'>and ji.huijizhanghao like '%${zhang}%'</if>" +
            " and xz.huizcxzid=7"+
            " </script>")
  /*   "<if test='zhang != null '>"+
             " and "
             + "</if>"*/
    List<Map<String,Object>> queryshejiList(@Param("zhang") String zhang);
    @Update("update huiji set huisidis=#{huisidis},huiguantuipai=#{huiguantuipai},huijipass=#{huijipass}, huijilianxiren=#{huijilianxiren}, huijiyouxiang=#{huijiyouxiang}, huijinicheng=#{huijinicheng}, huijishifoubyx=#{huijishifoubyx}, huijishifoubsj=#{huijishifoubsj}, huijishouji=#{huijishouji}, huijidianhua=#{huijidianhua}, huijiqq=#{huijiqq}, huijiquyu=#{huijiquyu}, huijiquyudf=#{huijiquyudf}, huijitouxiang=#{huijitouxiang},huijierweima=#{huijierweima}, huijimendiandz=#{huijimendiandz}, huijizhongjiemc=#{huijizhongjiemc}, huijizwojsgc=#{huijizwojsgc}, huijidituzb=#{huijidituzb}, huijidpgjc=#{huijidpgjc}, huijinid=#{huijinid}, huisysxl=#{huisysxl}, huiquanxian=#{huiquanxian}, huidjdqdate=#{huidjdqdate},huidengid=#{huidengid} where huijiid=#{huijiid}")
    void updateSeji(Huiji huiji);
    @Select("select * from huirenzhuang b,huiji a where b.huijid=a.huijiid and b.huijid=#{id}")
    Huirenzhuang queryhxrenzheng(@Param("id")Integer id);
    @Select("select * from t_Jurisdiction")
    List<Jurisdiction> quanxianList();
    @Select("select * from t_user where username=#{username} and zt=0")
    List<User>queryUser(@Param("username")String username);
    @Insert("insert into t_user(userid,username,userpass,name,zt)  values(userid,#{username},#{userpass},#{name},#{zt})")
    @Options(useGeneratedKeys=true, keyProperty="userid", keyColumn="id")
    void addquanxian(User user);

    @Insert("insert into t_juzj  values(id,#{userid},#{qid})")
    void addq(JUzj juzj);

    @Select("select * from t_user where zt=0")
    List<User> queryguanList();

    @Delete("DELETE FROM T_USER WHERE  USERID in(${ids})")
    void deleteuser(@Param("ids")String ids);

    @Delete("DELETE FROM T_JUzj WHERE  USERID in(${ids})")
    void deletejua(@Param("ids")String ids);
    @Select("select * from t_user  where  zt=0 and userid=#{userid}")
    Map<String,Object> queryqxHx(@Param("userid") Integer userid);
    @Select("select * from T_JUzj  where  userid=#{userid}")
    List<JUzj> queryqxJu(@Param("userid") Integer userid);
    @Update("update t_user set"+
            " userpass=#{userpass},"+
            " name=#{name},username=#{username} where userid=#{userid}")
    void updateUser(User user);
    @Update("update t_user set"+
            " name=#{name},username=#{username} where userid=#{userid}")
    void updateUses(User user);
    @Delete("DELETE FROM T_JUzj WHERE  USERID =#{userid} ")
    void deleteuse(@Param("userid")Integer userid);

    @Delete("DELETE FROM huiji WHERE  huijiid in(${ids})")
    void deleteZhuangIdAll(@Param("ids")String ids);
    @Delete("select * FROM huiji  WHERE  huijiid in(${ids})")
    List<Huiji> selzhuang(@Param("ids")String ids);
    @Delete("DELETE FROM huijin WHERE  huijinid =#{huijinid}")
    void deleteZhuangId(@Param("huijinid")Integer huijinid);
    @Delete("DELETE FROM huizcxz WHERE  huizcxzid =#{huijizhucexz}")
    void deleteZhuangaId(@Param("huijinid")String huijizhucexz);

}