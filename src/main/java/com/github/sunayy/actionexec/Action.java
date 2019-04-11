package com.github.sunayy.actionexec;

public interface Action<T, E extends Exception> {
    T action() throws E;
}