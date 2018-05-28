package com.four.service.impl;

import com.four.entity.Area;
import com.four.entity.Jurisdiction;
import com.four.mapper.YangscMapper;
import com.four.service.YangscService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @Override
    public List queryqvyvList(){
       lis.clear();
        return querydigui(0);
    }
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

    @Override
    public Area queryqvyv(Integer id) {
        return  mapper.queryqvyv(id);
    }

    @Override
    public void updateqvyv(Area area) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        area.setCreatedate(simpleDateFormat.format(new Date()));
        area.setPid("0");
        mapper.updateqvyv(area);
    }

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

    @Override
    public List<Map<String,Object>> queryQuxan(Integer userid) {
        System.err.println("到加了"+userid);
        return  mapper.queryQuxan(userid);
    }

}