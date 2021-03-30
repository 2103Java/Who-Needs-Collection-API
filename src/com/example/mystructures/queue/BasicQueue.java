package com.example.mystructures.queue;

public class BasicQueue<T> implements MyQueue<T> {

    private Node tail;
    private Node head;

    public BasicQueue() {
        head = new Node(null);
        tail = head;
    }

    @Override
    public boolean add(T t) {
        Node newNode = new Node(t);
        newNode.setNextNode(head);
        head = newNode;
        return true;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T peak() {
        return null;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public String toString() {
        if(head.getData() == null){
            return "Queue is empty";
        }
        System.out.println(head.getData());

        StringBuilder s = new StringBuilder();

        Node current = head;
        while(current != null) {
            s.append(current.getData());
            current = current.getNextNode();
        }
        return s.toString();
    }
}
