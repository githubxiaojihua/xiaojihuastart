package com.xiaojihu.xiaojihuaspringbootautoconfigration.service.autoConfiguration;

import com.xiaojihu.xiaojihuaspringbootautoconfigration.service.properties.HelloProperties;
import com.xiaojihu.xiaojihuaspringbootautoconfigration.service.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
@ConditionalOnWebApplication
public class HelloAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setProperties(helloProperties);
        return helloService;
    }
}
