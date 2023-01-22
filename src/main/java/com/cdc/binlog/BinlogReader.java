package com.cdc.binlog;
import com.cdc.core.CdcEvent;
import com.cdc.core.Connector;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
@Component
@RequiredArgsConstructor
@Slf4j
public class BinlogReader implements Connector {
    private volatile boolean running = false;
    private Consumer<CdcEvent> eventHandler;
    @Override
    public void start() {
        running = true;
        log.info("Starting binlog reader");
    }
    @Override
    public void stop() {
        running = false;
        log.info("Stopping binlog reader");
    }
    @Override
    public boolean isRunning() { return running; }
    public void setEventHandler(Consumer<CdcEvent> handler) { this.eventHandler = handler; }
}
