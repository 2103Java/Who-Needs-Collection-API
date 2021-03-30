package com.example.mystructures.queue;

import com.example.mystructures.AbstractArrayStructure;
import com.example.mystructures.lists.MyList;

public class BasicArrayQueue extends AbstractArrayStructure implements MyQueue, MyList  {
    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object peak() {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public boolean add(Object o, int index) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int getIndex(Object o) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean update(Object o, int index) {
        return false;
    }
}
