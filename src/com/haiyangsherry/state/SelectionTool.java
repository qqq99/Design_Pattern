package com.haiyangsherry.state;

import jdk.swing.interop.SwingInterOpUtils;

public class SelectionTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
