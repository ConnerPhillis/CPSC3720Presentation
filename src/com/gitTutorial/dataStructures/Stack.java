package com.gitTutorial.dataStructures;

import java.util.ArrayList;

public class Stack<T> implements IStack<T> {

    private ArrayList<T> elements = new ArrayList<>();

    private void  doNothing(){
        int yolo = 0;
    }

    public T pop(){
        return elements.remove(elements.size() - 1);
    }

    public void push(T element){
        elements.add(0, element);
    }

    public T peek(){
        return elements.get(0);
    }

    public int depth(){
        return elements.size();
    }

}
