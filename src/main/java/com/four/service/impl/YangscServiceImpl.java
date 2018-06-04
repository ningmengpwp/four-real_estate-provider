package com.four.service.impl;

import com.four.entity.*;
import com.four.mapper.YangscMapper;
import com.four.mysqlzc.ReadOnlyConnection;
import com.four.service.YangscService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.*;

public class YangscServiceImpl implements YangscService {
   private static List<Area> lis=new ArrayList<>();
    @Autowired
    private YangscMapper mapper;

    @Override
    public void addqvyv(Area area) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        area.setCreatedate(simpleDateFormat.format(new Date()));
        area.setPid("0");
        mapper.addqvyv(area);
    }

    @ReadOnlyConnection
    @Override
    public List queryqvyvList(){
       lis.clear();
        return querydigui(0);
    }
    @ReadOnlyConnection
    public List querydigui(Integer pid){
        List<Area> list = mapper.queryList(pid);
        if (list != null && list.size()>0){
            for (int i = 0; i < list.size(); i++) {
                lis.add(list.get(i));
                Integer id=  list.get(i).getId();
                List<Area> tree =querydigui(id);
            }
        }
            return lis;
    };
    @Override
    public void deleteqvyv(String ids) {
        System.err.println(ids);
        mapper.deleteqvyv(ids);
    }

    @Override
    public void addzi(Area area) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        area.setCreatedate(simpleDateFormat.format(new Date()));
        mapper.addqvyv(area);
    }

    @ReadOnlyConnection
    @Override
    public Area queryqvyv(Integer id) {
        return  mapper.queryqvyv(id);
    }

    @Override
    public void updateqvyv(Area area) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        area.setCreatedate(simpleDateFormat.format(new Date()));
        System.err.println(area+"修改 ");
        area.setPid("0");
        mapper.updateqvyv(area);
    }

    @ReadOnlyConnection
    @Override
    public List queryqvyvzi(Integer id) {
       Area area= mapper.queryqvyv(id);
        Area area1= mapper.queryqvyv(Integer.valueOf(area.getPid()));
        List list=new ArrayList();
        list.add(area1.getName());
        list.add(area);
        System.err.println(list);
        return list;
    }

    @Override
    public void updatezi(Area area) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        area.setCreatedate(simpleDateFormat.format(new Date()));
        System.err.println(area);
        mapper.updateqvyv(area);
    }

    @ReadOnlyConnection
    @Override
    public List<Map<String,Object>> queryQuxan(Integer userid) {
       // System.err.println("到加了"+userid);
        return  mapper.queryQuxan(userid);
    }
    @ReadOnlyConnection
    @Override
    public List<Map<String, Object>> queryshejiList(String zhang) {
        return mapper.queryshejiList(zhang);
    }

    @Override
    public void updateSeji(Huiji huiji) {
        mapper.updateSeji(huiji);
    }

    @ReadOnlyConnection
    @Override
    public Huirenzhuang queryhxrenzheng(Integer id) {
        System.err.println("66回显"+id);
        return   mapper.queryhxrenzheng(id);
    }

    @ReadOnlyConnection
    @Override
    public List<Jurisdiction> quanxianList() {
        return mapper.quanxianList();
    }

    @ReadOnlyConnection
    @Override
    public String queryUser(String username) {
        List<User>list=mapper.queryUser(username);
        String falg="";
        if (list.size()==0){
            falg="0";
        }else{
            falg="1";
        }
        return falg;
    }

    @Override
    public void addquanxian(String username, String pid, String userpass, String name) {
        User user=new User();
        user.setName(name);
        user.setUsername(username);
        user.setUserpass(userpass);
        user.setZt(0);
        mapper.addquanxian(user);
        String [] arr= pid.split(",");

        for (int i = 0; i <arr.length; i++) {
            JUzj juzj=new JUzj();
            juzj.setQid(Integer.valueOf(arr[i]));
            juzj.setUserid(user.getUserid());
            mapper.addq(juzj);
        }
    }

    @ReadOnlyConnection
    @Override
    public List<User> queryguanList() {
        return mapper.queryguanList();
    }

    @Override
    public void deleteGl(String ids) {
        mapper.deleteuser(ids);
        mapper.deletejua(ids);
    }

    @ReadOnlyConnection
    @Override
    public Map<String, Object> queryqxHx(Integer userid) {
        Map<String, Object>map=mapper.queryqxHx(userid);
       List <JUzj>list=mapper.queryqxJu(userid);
        map.put("list",list);
        return  map;
    }

    @Override
    public void updateQx(Integer userid, String username, String pid, String userpass, String name) {
        User user=new User();
        user.setUserid(userid);
        user.setName(name);
        user.setUsername(username);
        user.setUserpass(userpass);
        if (!userpass.equals("")&&userpass!=null){
            mapper.updateUser(user);
        }else{
            mapper.updateUses(user);
        }

        mapper.deleteuse(userid);
       String [] arr= pid.split(",");
        for (int i = 0; i <arr.length; i++) {
            JUzj juzj=new JUzj();
            juzj.setQid(Integer.valueOf(arr[i]));
            juzj.setUserid(userid);
            mapper.addq(juzj);
        }
    }

    @Override
    public void deleteZhuangIdAll(String ids) {
       /* List<Huiji>list=mapper.selzhuang(ids);
        for (int i = 0; i <list.size(); i++){
            mapper.deleteZhuangId(list.get(i).getHuijinid());
            mapper.deleteZhuangaId(list.get(i).getHuijizhucexz());
        }*/
        mapper.deleteZhuangIdAll(ids);
    }

}