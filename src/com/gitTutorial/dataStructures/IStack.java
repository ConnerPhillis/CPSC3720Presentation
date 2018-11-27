package com.gitTutorial.dataStructures;

public interface IStack<T> {

    /*
    returns and removes the element that is on the top of the stack
     */
    T pop();

    /*
    returns the top element from the stack without removing
     */
    T peek();

    void push(T element);

    int depth();

}
