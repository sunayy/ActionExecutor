package com.github.sunayy.actionexec.action;

import com.github.sunayy.actionexec.Action;

import java.io.IOException;

public interface IOAction<T> extends Action<T, IOException> {
    @Override
    T action() throws IOException;
}
