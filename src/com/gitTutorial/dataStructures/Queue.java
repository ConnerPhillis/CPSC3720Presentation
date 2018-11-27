package com.gitTutorial.dataStructures;

import java.util.ArrayList;

public class Queue<T> implements IQueue<T> {

    private ArrayList<T> elements = new ArrayList<>();

    public T dequeue(){
        return elements.remove(0);
    }

    public T getFront(){
        return elements.get(0);
    }

    public void enqueue(T element){
        elements.add(element);
    }

    public int depth(){
        return elements.size();
    }
}
