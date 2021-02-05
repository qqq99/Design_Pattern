package com.haiyangsherry.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }
    public EditorState pop(){
        var lastIndex = states.size();
        var lastState = states(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
