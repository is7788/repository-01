package com.dsideal.systemmanager.controller;

import com.dsideal.systemmanager.bean.TestBean;
import com.dsideal.systemmanager.bean.UserBean;
import com.dsideal.systemmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class TestUser {
    @Value("${server.address}")
    private String host;
    @Value("${server.servlet.context-path}")
    private String path;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String testController(){
        System.out.println("============>");

        TestBean tn = new TestBean();
        tn.setHost(host);
        tn.setPath(path);
        tn.setDate(new Date());
        tn.setName("Old Linc");

        return "=======> Host "+tn.getHost()+"; ========> Path "+tn.getPath()+": ==>>> "+tn.getDate()+tn.getName();
    }

    @RequestMapping("/getUser")
    public Object getHost(@RequestParam String loginName) {

        System.out.println( loginName + "=====> I am in getUser method ...");
        UserBean un = userRepository.findUserBeanByLoginName(loginName);

        return un;
    }
}
