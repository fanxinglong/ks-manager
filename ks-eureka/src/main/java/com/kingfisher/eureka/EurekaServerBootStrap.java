package com.kingfisher.eureka; /**
 * Created by xinglongfan on 2017/10/6.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author
 * @create 2017-10-06 下午6:10
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerBootStrap.class,args);
    }

}
