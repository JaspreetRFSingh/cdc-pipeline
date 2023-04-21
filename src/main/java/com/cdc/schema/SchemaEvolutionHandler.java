package com.cdc.schema;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
@Component
@Slf4j
public class SchemaEvolutionHandler {
    public void handleEvolution(String table, String oldSchema, String newSchema) {
        log.info("Schema evolution detected for table: {}", table);
    }
}
