package com.haiyangsherry.iterator;

public class Main {
    public static void main(String[] args){
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");
        /*for(var i = 0; i < history.getUrls().size(); i++){
            var url = history.getUrls().get(i);
            System.out.println(url);
        }*/
        Iterator iterator = history.createIterator();
        while(iterator.hasNext()){
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
        /*difference is we don't know anything about the BrowseHistory,
        * if History stored in let's say not List, store in a fixed length
        * Array, we can just add a new ArrayIterator class implements the Iterator*/
    }
}
