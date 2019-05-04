package com.ddl.config;

import com.ddl.property.GirlFriendServiceProperties;
import com.ddl.service.GirlFriendService;
import com.ddl.service.GirlFriendServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ddl
 * @date 2019/1/30
 * @time 11:11
 * @discription
 **/
@Configuration//注视掉当前项目运行ok
@ConditionalOnClass(GirlFriendService.class)
@EnableConfigurationProperties(GirlFriendServiceProperties.class)
public class GirlFriendAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public GirlFriendService girlFriendService() {
        return new GirlFriendServiceImpl();
    }
}
