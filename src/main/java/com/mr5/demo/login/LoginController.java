package com.mr5.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/admin")
    public String adminPage(Model model) {
        model.addAttribute("aa",11111);
        return "/WEB-INF/admin.jsp";
    }

    @RequestMapping("/gotoPage")
    public String gotoPage(Model model,String path) {
        System.out.println("跳转到"+path);
        return path;
    }
}
