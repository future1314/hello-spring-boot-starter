package com.ddl.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author dd
 * @date 2019/1/30
 * @time 11:22
 * @discription
 **/
@ConfigurationProperties(prefix = "spring.girlfriend")
public class GirlFriendServiceProperties {

    /** 默认输出 */
    private String message = "Hi, good morning !";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
