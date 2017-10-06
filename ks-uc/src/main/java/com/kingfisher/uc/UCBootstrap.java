package com.kingfisher.uc;/**
 * Created by xinglongfan on 2017/10/6.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户中心
 *
 * @author
 * @create 2017-10-06 下午7:32
 **/
@SpringBootApplication
@RestController
@EnableEurekaClient
public class UCBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(UCBootstrap.class,args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
