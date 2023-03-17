package com.cdc.binlog;
import com.cdc.core.CdcEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import java.util.*;
@Component
@Slf4j
public class MySqlBinlogParser {
    public CdcEvent parseEvent(byte[] data) {
        log.info("Parsing MySQL binlog event");
        return CdcEvent.builder().build();
    }
}
