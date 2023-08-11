package com.cdc.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
@Component
@Slf4j
public class OffsetStorage {
    private final AtomicLong currentOffset = new AtomicLong(0);
    public void saveOffset(long offset) { currentOffset.set(offset); }
    public long getOffset() { return currentOffset.get(); }
}
