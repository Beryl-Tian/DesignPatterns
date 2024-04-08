package org.example.di_container;

public class NoSuchBeanDefinitionException extends RuntimeException{
    public NoSuchBeanDefinitionException() {
    }

    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }

    public NoSuchBeanDefinitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchBeanDefinitionException(Throwable cause) {
        super(cause);
    }

    public NoSuchBeanDefinitionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
