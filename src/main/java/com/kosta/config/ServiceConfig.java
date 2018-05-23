package com.kosta.config;

import com.kosta.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public CRMService crmService() {
        return new CRMServiceImp();
    }
    @Bean
    public CreditService creditService(){
        return new CreditServiceImp();
    }

    @Bean
    public DMVService dmvService(){
        return new DMVServiceImp();
    }

}
