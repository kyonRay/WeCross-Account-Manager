package com.webank.wecross.account.service.config;

import com.webank.wecross.account.service.RestRequestFilter;
import com.webank.wecross.account.service.ServiceContext;
import com.webank.wecross.account.service.account.UAManager;
import com.webank.wecross.account.service.authcode.AuthCodeManager;
import com.webank.wecross.account.service.authentication.JwtManager;
import javax.annotation.Resource;
import javax.swing.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceContextConfig {
    @Resource ServiceConfig serviceConfig;
    @Resource JwtManager jwtManager;
    @Resource UAManager uaManager;
    @Resource AuthCodeManager authCodeManager;
    @Resource RestRequestFilter restRequestFilter;

    @Bean
    public ServiceContext newServiceContext() {
        ServiceContext serviceContext = new ServiceContext();
        serviceContext.setServiceConfig(serviceConfig);
        serviceContext.setJwtManager(jwtManager);
        serviceContext.setUaManager(uaManager);
        serviceContext.setAuthCodeManager(authCodeManager);
        serviceContext.setRestRequestFilter(restRequestFilter);
        return serviceContext;
    }
}
