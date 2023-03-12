package com.learn.sping.learnspringboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "currency-service")
@Component // to make sure spring manages it
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;
}
