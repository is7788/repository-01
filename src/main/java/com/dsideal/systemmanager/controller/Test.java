package com.dsideal.systemmanager.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test {
    @Value("${server.address}")
    private String host;
    @Value("${server.servlet.context-path}")
    private String path;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String testController(){
        System.out.println("============>");

        return "=======> Host "+host+"; ========> Path "+path;
    }
}
