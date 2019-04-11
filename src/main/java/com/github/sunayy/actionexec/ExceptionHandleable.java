package com.github.sunayy.actionexec;

public interface ExceptionHandleable<E extends Exception> {
    void handle(E e);
    Class<E> getTargetExceptionClass();
}
