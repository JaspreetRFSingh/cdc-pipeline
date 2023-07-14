package com.cdc.config;
import lombok.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
@Configuration
@ConfigurationProperties(prefix = "cdc")
@Data
public class CdcConfig {
    private String binlogHost = "localhost";
    private int binlogPort = 3306;
    private String binlogUsername = "root";
    private String binlogPassword = "root";
}
