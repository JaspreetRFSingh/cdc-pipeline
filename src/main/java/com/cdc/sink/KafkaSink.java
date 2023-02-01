package com.cdc.sink;
import com.cdc.core.CdcEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
@Component
@Slf4j
public class KafkaSink {
    public void send(CdcEvent event) {
        log.info("Sending CDC event to Kafka topic: {}", event.getTable());
    }
}
