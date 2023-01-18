package com.cdc.core;
public interface Connector {
    void start();
    void stop();
    boolean isRunning();
}
