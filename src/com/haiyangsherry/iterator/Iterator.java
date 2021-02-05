package com.haiyangsherry.iterator;

public interface Iterator {
    boolean hasNext();
    String current();
    //向下遍历
    void next();
}
