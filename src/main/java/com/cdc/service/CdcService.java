package com.cdc.service;
import com.cdc.core.CdcEvent;
import com.cdc.binlog.BinlogReader;
import com.cdc.sink.KafkaSink;
import com.cdc.stream.EventStream;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import javax.annotation.*;
@Service
@RequiredArgsConstructor
@Slf4j
public class CdcService {
    private final BinlogReader binlogReader;
    private final EventStream eventStream;
    private final KafkaSink kafkaSink;
    @PostConstruct
    public void init() {
        binlogReader.setEventHandler(event -> {
            eventStream.publish(event);
            kafkaSink.send(event);
        });
        binlogReader.start();
    }
    @PreDestroy
    public void cleanup() { binlogReader.stop(); }
}
