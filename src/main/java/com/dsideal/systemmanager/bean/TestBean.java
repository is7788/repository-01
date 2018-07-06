package com.dsideal.systemmanager.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

public class TestBean {

    private String host;
    private String path;

    private String name;
    private Date date;

    public TestBean() {
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
