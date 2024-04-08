package org.example.di_container;

public class BeanCreationFailureException extends RuntimeException {
    public BeanCreationFailureException(String s, ReflectiveOperationException e) {

    }
}
