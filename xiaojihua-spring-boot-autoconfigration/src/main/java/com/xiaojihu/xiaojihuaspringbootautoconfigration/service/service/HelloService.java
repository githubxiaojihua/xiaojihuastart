package com.xiaojihu.xiaojihuaspringbootautoconfigration.service.service;

import com.xiaojihu.xiaojihuaspringbootautoconfigration.service.properties.HelloProperties;

public class HelloService {
    private HelloProperties properties;

    public HelloProperties getProperties() {
        return properties;
    }

    public void setProperties(HelloProperties properties) {
        this.properties = properties;
    }

    public String sayHello(String name){
        return properties.getPrefix() + "-" + name + "-" + properties.getSuffix();
    }
}
