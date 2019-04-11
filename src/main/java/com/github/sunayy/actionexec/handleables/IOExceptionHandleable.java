package com.github.sunayy.actionexec.handleables;

import com.github.sunayy.actionexec.ExceptionHandleable;

import java.io.IOException;

public interface IOExceptionHandleable extends ExceptionHandleable<IOException> {
    @Override
    void handle(IOException e);

    @Override
    default Class<IOException> getTargetExceptionClass() {
        return IOException.class;
    }
}
