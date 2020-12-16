package com.pl.demo.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ToString
@ConfigurationProperties(prefix = "spring.database")
public class DBProperty {

    private String server;
    private Integer port;
    private String db;
    private String username;
    private String password;
    private String schema;
}
