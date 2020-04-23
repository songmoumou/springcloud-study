package com.song.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping()
public class ConsumerController {

  private static final String REST_URL_PREFIX = "http://localhost:8001";
  //MICROSERVICECLOUD-DEP：为Eureka Server中心的微服务实例名称
  //private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private ConsumerService consumerService;

  @RequestMapping(value = "/list")
  public List<String> list() {
    return consumerService.getList();
  }


}

