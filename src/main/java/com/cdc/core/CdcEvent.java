package com.cdc.core;
import lombok.*;
import java.time.*;
import java.util.*;
@Data
@Builder
public class CdcEvent {
    private String table;
    private String operation;
    private Map<String, Object> before;
    private Map<String, Object> after;
    private LocalDateTime timestamp;
    private long position;
}
