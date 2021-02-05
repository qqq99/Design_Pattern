package com.haiyangsherry.state;
//abstract class and interface allow loosely coupling, you cannot instantiate objects
/*public abstract class Tool {
    public abstract void mouseDown();
    public abstract void mouseUp();
}*/
public interface Tool{
    void mouseDown();
    void mouseUp();
}
