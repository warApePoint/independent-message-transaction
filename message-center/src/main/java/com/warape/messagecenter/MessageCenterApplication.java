package com.warape.messagecenter;


import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author wanmingyu
 */
@SpringBootApplication
@MapperScan(value = "com.warape.messagecenter.mapper")
@DubboComponentScan(basePackages = "com.warape.messagecenter.services.impl")
@EnableScheduling
@EnableDubbo
public class MessageCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageCenterApplication.class, args);
    }

}
