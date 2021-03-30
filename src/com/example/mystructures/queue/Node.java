package com.example.mystructures.queue;

public class Node<T> {
    private T data;
    private Node nextNode;

    Node(T t) {
        data = t;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public T getData() {
        return data;
    }
}
