package com.simpler.springcloudalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author simpler
 * @program: cloud2020
 * @description:
 * @create 2020/12/14 14:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderMain9002.class, args);
    }
}
