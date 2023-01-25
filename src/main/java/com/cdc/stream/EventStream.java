package com.cdc.stream;
import com.cdc.core.CdcEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import java.util.*;
import java.util.concurrent.*;
@Component
@Slf4j
public class EventStream {
    private final BlockingQueue<CdcEvent> queue = new LinkedBlockingQueue<>(10000);
    public void publish(CdcEvent event) {
        try {
            queue.offer(event, 1, TimeUnit.SECONDS);
            log.info("Published CDC event for table: {}", event.getTable());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public CdcEvent consume() throws InterruptedException {
        return queue.poll(5, TimeUnit.SECONDS);
    }
}
