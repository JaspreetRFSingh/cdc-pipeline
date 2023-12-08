package com.cdc.monitor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import java.util.concurrent.atomic.*;
@Component
@Slf4j
public class CdcMetrics {
    private final AtomicLong eventsProcessed = new AtomicLong(0);
    public void recordEvent() { eventsProcessed.incrementAndGet(); }
    public long getEventsProcessed() { return eventsProcessed.get(); }
}
