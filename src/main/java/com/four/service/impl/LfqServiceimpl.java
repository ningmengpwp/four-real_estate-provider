package com.four.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.four.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.four.dao.LfqDao;
import com.four.service.LfqService;
import org.springframework.data.redis.core.RedisTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LfqServiceimpl implements LfqService{
   @Autowired
   private RedisTemplate redisTemplate;
    @Autowired
    private LfqDao lfqDao;

    @Override
    public String queryuser(User user){

        System.err.println(user+"user");
        List<User> list = lfqDao.queryuser(user.getUsername());
        if (list.size() >= 1) {
            User user1 = list.get(0);
            if(user.getUserpass().equals(user1.getUserpass())){
              /* request.getSession().setAttribute("user",user1+"session");*/
                //成
             /*  List list1=new ArrayList();
                list1.add(list.get(0).getUserid());
                list1.add(list.get(0).getUsername());
                list1.add(list.get(0).getUserpass());
                Jedis jedis = new Jedis("localhost");
                jedis.set("login",list1.toString());
              *//*  Set<String> keys = jedis.keys("*");*//*
                String keys = jedis.get("login");
                System.err.println(keys+"99999999999999999999");*/

              /*   redisTemplate.opsForValue().set("lfq"+user1.getUserid().toString(),list1);
               String a = (String) redisTemplate.opsForValue().get("gger");*/
               /* System.err.println(a+"刘风奇");*/
                return "1"+user1.getUserid();
            }else{
                //密码错误
                return "mimacuowu";
            }
        }else{
            //用户名相同
            return "yonghuming";
        }

    }
    @Override
    public List<Tree> querytree(Integer a){
        Integer querytree = lfqDao.querytree(a);
        return queryTreeAgain(a,querytree);
    }


    // 递归  自己调用自己
    public List<Tree> queryTreeAgain(Integer a,Integer pid){
        List<Tree> trees = lfqDao.queryTreeAgain(a,pid);
        if(trees != null && trees.size() > 0){
            for (int i = 0; i < trees.size(); i++) {
                List<Tree> trees2 = queryTreeAgain(a,trees.get(i).getId());
                trees.get(i).setNodes(trees2);
            }
        }
        return trees;
    }

    @Override
    public List<Metro> queryMetro() {
        return lfqDao.queryMetro();
    }


    @Override
    public Integer queryxuhao() {
        return lfqDao.queryxuhao();
    }

    @Override
    public void addditiexianlu(Metro metro) {

        SimpleDateFormat mdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        metro.setCreatedate(mdf.format(new Date()));
        lfqDao.addditiexianlu(metro);
    }

    @Override
    public void deleteditie(Integer id) {
        lfqDao.deleteditie(id);
    }

    @Override
    public void deleteidspishan(String id) {
        String[] split = id.split(",");
        for (int i = 0; i <split.length ; i++) {
            lfqDao.deleteidspishan(split[i]);
        }
    }

    @Override
    public Metro updateditiehui(Integer id) {

        return lfqDao.updateditiehui(id);
    }

    @Override
    public void updateditiegai(Metro metro) {
        lfqDao.updateditiegai(metro);
    }

    @Override
    public List<Overstory> queryOverstory() {
        return lfqDao.queryOverstory();
    }

    @Override
    public Integer queryfwlcxuhao() {
        return lfqDao.queryfwlcxuhao();
    }

    @Override
    public void adddfanglcsz(Overstory overstory) {
        SimpleDateFormat mdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        overstory.setCreatedate(mdf.format(new Date()));
        lfqDao.adddfanglcsz(overstory);
    }

    @Override
    public void deletefwcxsz(Integer id) {
        lfqDao.deletefwcxsz(id);
    }

    @Override
    public void deletefwcxpishan(String id) {
        String[] split = id.split(",");
        for (int i = 0; i <split.length ; i++) {
            lfqDao.deletefwcxpishan(split[i]);
        }
    }

    @Override
    public Overstory updatefwcxhui(Integer id) {
        return lfqDao.updatefwcxhui(id);
    }

    @Override
    public void updatefwcxszgai(Overstory overstory) {
        lfqDao.updatefwcxszgai(overstory);
    }

    @Override
    public List<Map<Object, String>> queryHuiji() {

        return lfqDao.queryHuiji();
    }
    @Override
    public List queryQuxan(Integer userid) {
        System.err.println("到加了");
        return  lfqDao.queryQuxan(userid);
    }

    @Override
    public  Huiji updatesyhyhuicha(String id) {
        return lfqDao.updatesyhyhuicha(id);
    }

    @Override
    public List<Huideng> queryhydj() {
        return lfqDao.queryhydj();
    }

    @Override
    public List<Area> querydrea() {
        return lfqDao.querydrea();
    }

    @Override
    public List<Area> querydreadifangid(String id) {
        return lfqDao.querydreadifangid(id);
    }

    @Override
    public void updatesyhygai(Huiji hjj) {


         lfqDao.updatesyhygai(hjj);
    }

    @Override
    public Huirenzhuang queryhuiyuanrenzhneg(String id) {
      return lfqDao.queryhuiyuanrenzhneg(id);
    }

    @Override
    public void updatexiugairz(Huirenzhuang rz) {
        lfqDao.updatexiugairz(rz);
    }

    @Override
    public List<t_sellzu> queryWTMZ() {

        return lfqDao.queryWTMZ();
    }

    @Override
    public void deleteMZ(String ids) {
        String[] split = ids.split(",");
        for (int i = 0; i <split.length ; i++) {
            lfqDao.deleteMZ(split[i]);
        }

    }

    @Override
    public Map<String , Object> queryshoukuan() {

        Map<String , Object> map=new HashMap<String, Object>();

        List<Esfjgzs> xiao = lfqDao.queryshoukuan();

        if (xiao!=null&&xiao.size()>0) {
            Integer  ind=xiao.size();
            String[]    setarr=new   String[ind];
            Integer[]   intarr=new   Integer[ind];
            for (int i = 0; i < xiao.size(); i++) {

                String  a=xiao.get(i).getEstime()+"年";
                setarr[i]=a;
                Integer  b=Integer.valueOf(xiao.get(i).getEsypm().toString());
                intarr[i]=b;
            }
            map.put("succ", true);
            map.put("leg", "['收入金额']");
            map.put("xax", setarr);
            map.put("ser", intarr);
        }else{

            map.put("succ", false);
        }
        return map;
    }

    @Override
    public List<Map<String, Object>> queryWTZF() {
        return lfqDao.queryWTZF();
    }

    @Override
    public void deleteZF(String idse) {
        String[] split = idse.split(",");
        for (int i = 0; i <split.length ; i++) {
            lfqDao.deleteZF(split[i]);
        }
    }


}