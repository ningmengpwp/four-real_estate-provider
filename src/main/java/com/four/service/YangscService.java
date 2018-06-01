package com.four.service;

import com.four.entity.*;

import java.util.List;
import java.util.Map;

public interface YangscService {
    void addqvyv(Area area);
    List queryqvyvList();
    void deleteqvyv(String ids);
    void addzi(Area area);
    Area queryqvyv(Integer id);
    void updateqvyv(Area area);
    List queryqvyvzi(Integer id);
    void updatezi(Area area);
    List<Map<String,Object>> queryQuxan(Integer userid);
    List<Map<String,Object>> queryshejiList(String zhang);
    void updateSeji(Huiji huiji);
    Huirenzhuang queryhxrenzheng(Integer id);
    List<Jurisdiction> quanxianList();
    String queryUser(String username);
    void addquanxian(String username, String pid, String userpass, String name);
    List<User> queryguanList();
    void deleteGl(String ids);
    Map<String,Object> queryqxHx(Integer userid);
    void updateQx(Integer userid, String username, String pid, String userpass, String name);
    void deleteZhuangIdAll(String ids);
}
