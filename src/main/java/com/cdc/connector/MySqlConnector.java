package com.cdc.connector;
import com.cdc.core.Connector;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
@Component
@Slf4j
public class MySqlConnector implements Connector {
    private volatile boolean running = false;
    @Override public void start() { running = true; log.info("MySQL connector started"); }
    @Override public void stop() { running = false; log.info("MySQL connector stopped"); }
    @Override public boolean isRunning() { return running; }
}
