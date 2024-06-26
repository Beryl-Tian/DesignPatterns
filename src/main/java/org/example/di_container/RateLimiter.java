package org.example.di_container;


public class RateLimiter {
    private RedisCounter redisCounter;

    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }

    public boolean isValid() {
        this.redisCounter.IncreamentAndGet();
        return true;
    }
}