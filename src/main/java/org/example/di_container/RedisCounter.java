package org.example.di_container;

public class RedisCounter {
    private String ipAddress;
    private int port;

    public RedisCounter(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void IncreamentAndGet() {
        System.out.println("Connect to " + this.ipAddress + ":" + this.port);
    }
}
