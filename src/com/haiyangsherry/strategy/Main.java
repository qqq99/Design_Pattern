package com.haiyangsherry.strategy;

public class Main {
    public static void main(String[] args){
        var imageStorage = new ImageStorage();
        imageStorage.store("a",new JpegCompressor(), new HighContrast());
        imageStorage.store("a",new PngCompressor(), new BlackAndWhite());
    }
}
