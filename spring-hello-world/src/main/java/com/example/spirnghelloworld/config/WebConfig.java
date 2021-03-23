package com.example.spirnghelloworld.config;

import com.example.lib.User;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author gcsShe
 * @create 2021/3/19 15:22
 */
@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        Filter filter = (servletRequest, servletResponse, filterChain) -> {
            System.out.println("MyFilter 执行过滤");
            filterChain.doFilter(servletRequest, servletResponse);
        };
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(filter);
        bean.setOrder(1);
        bean.setName("MyFilter");
        bean.addUrlPatterns("/*");
        bean.addInitParameter("paramName", "paramValue");
        return bean;
    }

    public User user(){
        return new User();
    }

}
