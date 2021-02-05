package com.haiyangsherry.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    //private List<String> urls = new ArrayList<>();
    //change to fixed length Array
    private String[] urls = new String[10];
    private int count;
    /*public void push(String url){
        urls.add(url);
    }*/
    public void push(String url){
        /* urls[count]=url;
           count++; */
        urls[count++] = url;
    }

    /*public String pop(){
        var lastIndex = urls.size()-1;
        var lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);
        return lastUrl;
    }*/
    public String pop(){
        return urls[--count];
    }

    public Iterator createIterator(){
        //return new ListIterator(this);
        return new ArrayIterator(this);
    }

    //nested class, easy to access urls
    /*public class ListIterator implements Iterator{
        //First of all, we need a reference to the BrowseHistory object which we are going to iterate over:
        private BrowserHistory history;
        // State store how many urls are in history
        private int index;

        public ListIterator(BrowserHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
            //because this is a nested class inside BrowseHistory, so we have access to BrowseHistory's private field urls
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }*/
    public class ArrayIterator implements Iterator{
        private BrowserHistory history;
        private int index;
        public ArrayIterator(BrowserHistory history){
            this.history = history;
        }
        @Override
        public boolean hasNext() {
            return (index<history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
