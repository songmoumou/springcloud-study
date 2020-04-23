package com.song.cloud.filters;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author AJohn
前置路由
路由
后置路由
异常处理
 */
@Component
@EnableZuulProxy
public class FilterConfig {
  @Bean
  public PreFilter preFilter() {
    return new PreFilter();
  }
  @Bean
  public PostFilter postFilter() {
    return new PostFilter();
  }
  @Bean
  public ErrorFilter errorFilter() {
    return new ErrorFilter();
  }
  @Bean
  public RouteFilter routeFilter() {
    return new RouteFilter();
  }
}
