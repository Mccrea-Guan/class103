package com.leyou.config;

import com.leyou.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration//相当于配置文件  必须要@Configuration和继承WebMvcConfigurer
public class MySpringMVCConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor())//添加拦截器并创建对应拦截器类的对象
                .addPathPatterns("/user/**")//拦截路径
                .excludePathPatterns("/user/hello1");//放行路径
    }
}
