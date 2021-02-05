package com.haiyangsherry.state;

public class EraserTool implements Tool{
    public void mouseDown(){
        System.out.println("Eraser icon");
    }
    public void mouseUp(){
        System.out.println("Erase something");
    }
}
