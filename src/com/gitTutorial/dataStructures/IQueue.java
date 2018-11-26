package com.gitTutorial.dataStructures;

public interface IQueue<T> {

    T dequeue();

    T getFront();

    void enqueue(T element);

    int depth();

}
