package com.dsideal.systemmanager.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.dsideal.systemmanager.bean.TestBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class Test {
    @Value("${server.address}")
    private String host;
    @Value("${server.servlet.context-path}")
    private String path;

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
}
