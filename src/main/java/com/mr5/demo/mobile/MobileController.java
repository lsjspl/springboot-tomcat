package com.mr5.demo.mobile;

import com.mr5.demo.util.conf.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequestMapping("mobile")
@Controller
public class MobileController {

    @Autowired
    MobileService mobileService;

    @Autowired
    Config config;

    @RequestMapping("/list")
    public String list(Model model) {
        System.out.println(config.TEST_CONFIG+"  ");
        List<Map<String, Object>> list = mobileService.test();
        model.addAttribute("list", list);


        return "admin";
    }


    @RequestMapping("/add")
    public String add(Model model) {
        List<Mobile> mobiles=new ArrayList<>();
        Mobile mobile=new Mobile();
        mobile.setId(1);
        mobile.setName("小明");
        mobile.setMaxMoney("222222");
        mobiles.add(mobile);
        mobileService.add(mobiles);
        return "admin";
    }

}
