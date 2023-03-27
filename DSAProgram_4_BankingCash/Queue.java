package com.bridgelabz.DSAProgram_4_BankingCash;

public class Queue<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T data) {
        linkedList.addData(data);
    }

    public void peek() {
        linkedList.display();
    }

    public T dequeue(){
        return linkedList.pop();
    }

    public int size(){
        return linkedList.size();
    }

}