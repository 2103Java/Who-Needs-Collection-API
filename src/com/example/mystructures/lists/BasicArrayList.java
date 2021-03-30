package com.example.mystructures.lists;

import com.example.mystructures.AbstractArrayStructure;

public class BasicArrayList<T> extends AbstractArrayStructure<T> implements MyList<T> {

    public BasicArrayList() {
        super();
    }

    public BasicArrayList(T... structure) {
        super(structure);
    }

    @Override
    public boolean add(T t) {
        ensureSize();

        structure[internalSize++] = t;
        return true;
    }

    @Override
    public boolean add(T t, int index) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int getIndex(T t) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean update(T t, int index) {
        return false;
    }
}
