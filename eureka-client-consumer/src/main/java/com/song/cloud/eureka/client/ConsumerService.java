package com.song.cloud.eureka.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author AJohn
 */
@Service
public class ConsumerService {
  @Autowired
  RestTemplate restTemplate;
  public List<String> getList(){
    //producer01为生产者服务名
    //Spring Cloud RestTemplate @LoadBalanced 支持ip、域名、服务名 调用
    return restTemplate.getForObject("http://producer/getList",List.class);
  }
}
