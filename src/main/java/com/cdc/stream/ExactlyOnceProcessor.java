package com.cdc.stream;
import com.cdc.core.CdcEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import java.util.*;
import java.util.concurrent.*;
@Component
@Slf4j
public class ExactlyOnceProcessor {
    private final Set<String> processedIds = ConcurrentHashMap.newKeySet();
    public boolean processOnce(CdcEvent event) {
        String id = event.getTable() + event.getPosition();
        return processedIds.add(id);
    }
}
