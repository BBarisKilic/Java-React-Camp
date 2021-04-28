package com.example.day3_inheritance2;

public class FileLogger extends Logger{

    @Override
    public void log() {
        super.log();
        System.out.println("File loglandı.");
    }
}
