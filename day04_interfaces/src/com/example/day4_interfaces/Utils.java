package com.example.day4_interfaces;

public class Utils {
     public static void runLoggers(Logger[] loggers, String message){
        for(Logger logger : loggers){
            logger.log(message);
        }
    }
}
