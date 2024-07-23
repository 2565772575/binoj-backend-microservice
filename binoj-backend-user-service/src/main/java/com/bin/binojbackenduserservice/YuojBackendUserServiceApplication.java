package com.bin.binojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.bin.binojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.bin")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.bin.binojbackendserviceclient.service"})
public class YuojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuojBackendUserServiceApplication.class, args);
    }

}
