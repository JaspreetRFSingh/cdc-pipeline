package com.cdc.util;
import lombok.*;
@Data
@Builder
public class BinlogPosition {
    private String filename;
    private long position;
}
