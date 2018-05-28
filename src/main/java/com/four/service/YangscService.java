package com.four.service;

import com.four.entity.Area;
import com.four.entity.Jurisdiction;

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
}
