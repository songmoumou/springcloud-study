package com.song.cloud.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author AJohn
 */
@RestController
public class ProducerController {

  @Autowired
  protected HttpServletRequest request;
  @RequestMapping("/getList")
  public List<String> getlist(){
    System.out.println("调用："+request.getLocalPort());
    return new ArrayList<String>(){{
      add("zhangsan");
      add("lisi");
      add("wangwu");
    }};
  }
}
