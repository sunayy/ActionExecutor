package com.github.sunayy.actionexec.executors;

import com.github.sunayy.actionexec.ExceptionHandlerPool;
import com.github.sunayy.actionexec.action.IOAction;
import com.github.sunayy.actionexec.executor.ActionExecutor;
import com.github.sunayy.actionexec.handleables.IOExceptionHandleable;

import java.io.IOException;

public class IOActionExecutor<T> extends ActionExecutor<T, IOException> {

    public IOActionExecutor(IOAction action, IOExceptionHandleable handler) {
        super(action, handler);
    }

    public IOActionExecutor(IOAction action, IOExceptionHandleable baseHandler, ExceptionHandlerPool handlers) {
        super(action, baseHandler, handlers);
    }
}
