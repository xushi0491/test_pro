package com.example.autoconfigure.service;

import com.example.autoconfigure.propeties.AutoProperties;
import com.example.autoconfigure.service.impl.AutoServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@ConditionalOnClass(AutoServiceImpl.class)
@EnableConfigurationProperties(AutoProperties.class)
public class AutoConfigureEnable {
    @Resource
    AutoProperties autoProperties;

    @Bean
    @ConditionalOnMissingBean(AutoService.class)
    public AutoService getAutoService() {
        AutoService as = new AutoServiceImpl();
        as.setName(autoProperties.getName());
        System.out.println("autoConfigure ====> 生成bean自动配置生效");
        return as;
    }
}
