package com.cdc.schema;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import java.util.*;
import java.util.concurrent.*;
@Component
@Slf4j
public class SchemaRegistry {
    private final Map<String, List<String>> tableSchemas = new ConcurrentHashMap<>();
    public void registerTable(String table, List<String> columns) {
        tableSchemas.put(table, columns);
        log.info("Registered schema for table: {}", table);
    }
    public List<String> getColumns(String table) { return tableSchemas.get(table); }
}
