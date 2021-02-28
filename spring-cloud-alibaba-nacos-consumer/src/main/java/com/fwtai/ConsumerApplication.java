package com.fwtai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//本项目是服务消费者,未整合Feign
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication{

    public static void main(final String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}