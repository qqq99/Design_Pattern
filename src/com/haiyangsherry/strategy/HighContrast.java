package com.haiyangsherry.strategy;

public class HighContrast implements Filter{
    public void apply(String fileName){
        System.out.println("Using High contrast filter");
    }
}
