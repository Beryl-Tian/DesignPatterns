package org.example.di_container;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        Boolean isValid = rateLimiter.isValid();
        System.out.println("RateLimiter call isValid method, result: " + isValid);
    }
}
