package com.josemorenoesteban.lab.java.streams.pusheando.simple;

public class Data {
    public final long   timestamp;
    public final String value;
    
    public Data(final String value) {
        timestamp  = System.currentTimeMillis();
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Data [timestamp: %s, value: %s]", timestamp, value);
    }
    
}
