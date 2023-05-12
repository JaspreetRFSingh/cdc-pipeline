package com.cdc.binlog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BinlogParserTest {
    @Test void testParseEvent() {
        MySqlBinlogParser parser = new MySqlBinlogParser();
        assertNotNull(parser.parseEvent(new byte[0]));
    }
}
