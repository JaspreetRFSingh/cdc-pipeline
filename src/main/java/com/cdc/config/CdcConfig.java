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
    private String binlogUsername = System.getenv("BINLOG_USERNAME") != null ? System.getenv("BINLOG_USERNAME") : "root";
    private String binlogPassword = System.getenv("BINLOG_PASSWORD") != null ? System.getenv("BINLOG_PASSWORD") : "changeme";
}
