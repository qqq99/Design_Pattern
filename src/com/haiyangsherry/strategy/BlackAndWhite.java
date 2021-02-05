package com.haiyangsherry.strategy;

public class BlackAndWhite implements Filter{

    @Override
    public void apply(String fileName) {
        System.out.println("Using black and white filter");
    }
}
