package com.example.day5_nLayeredDemo.core;

import com.example.day5_nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        JLoggerManager jLoggerManager = new JLoggerManager();
        jLoggerManager.log(message);
    }
}
