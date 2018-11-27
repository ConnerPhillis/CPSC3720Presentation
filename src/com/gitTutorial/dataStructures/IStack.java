package com.gitTutorial.dataStructures;

public interface IStack<T> {

    /*
    removes an element from the top of the stack
     */
    T pop();

    T peek();

    void push(T element);

    int depth();

}
