package com.song.cloud.eureka.client;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Choisaaaa on 2018/7/7.
 * 自定义配置类
 */

@Configuration
public class MyConfig {
  @Bean
  @LoadBalanced//使用负载均衡
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }
}
