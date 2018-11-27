package com.gitTutorial.dataStructures;

import java.util.ArrayList;

public class Stack<T> implements IStack<T> {

    private ArrayList<T> elements = new ArrayList<>();

    /*
    removes an element from the top of the stack
     */
    public T pop(){
        return elements.remove(elements.size() - 1);
    }

    /*
    adds an element to the top of the stack
     */
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
