package com.kingfisher.gate;/**
 * Created by xinglongfan on 2017/10/6.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 网关
 *
 * @author
 * @create 2017-10-06 下午7:15
 **/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class APIGateBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(APIGateBootstrap.class,args);

    }
}
