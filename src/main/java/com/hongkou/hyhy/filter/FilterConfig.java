package com.hongkou.hyhy.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 曹晓翀 on 2017/3/19.
 */
@Configuration
public class FilterConfig {

    @Bean
    FilterRegistrationBean testFilterRegister(){
        FilterRegistrationBean register = new FilterRegistrationBean();
        register.setFilter(new TestFilter());
        register.addUrlPatterns("/*");
        return register;
    }
}
