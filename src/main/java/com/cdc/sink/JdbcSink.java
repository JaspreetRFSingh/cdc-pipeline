package com.cdc.sink;
import com.cdc.core.CdcEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
@Component
@Slf4j
public class JdbcSink {
    public void write(CdcEvent event) {
        log.info("Writing CDC event to JDBC: {}", event.getTable());
    }
}
