package com.mr5.demo.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class MobileService {
    @Autowired
    MobileMapper mobileMapper;

    public List<Map<String, Object>> test(){
        System.out.println(mobileMapper.getMobiles());
        return mobileMapper.getMobile();
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
    public void add(List<Mobile> mobiles){
        mobileMapper.add(mobiles);
    }

}
