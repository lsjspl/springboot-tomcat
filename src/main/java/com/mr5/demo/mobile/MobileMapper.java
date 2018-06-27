package com.mr5.demo.mobile;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MobileMapper {
    List getMobile();
    List<Mobile> getMobiles();
    void add(List<Mobile> mobiles);
}