package com.cdc.controller;
import com.cdc.core.CdcEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api/v1/cdc")
@Slf4j
public class CdcController {
    @GetMapping("/status")
    public Map<String, Object> getStatus() {
        return Map.of("status", "running", "connectors", 1);
    }
}
