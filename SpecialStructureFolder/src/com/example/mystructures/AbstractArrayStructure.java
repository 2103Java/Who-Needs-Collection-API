package com.example.mystructures;

public abstract class AbstractArrayStructure<T> implements RootStructure<T> {
    protected T[] structure;
    protected int internalSize;

    public AbstractArrayStructure() {
        structure = (T[]) new Object[8];
        internalSize = 8;
    }

    public AbstractArrayStructure(T... structure) {
        this.structure = structure;
        internalSize = structure.length;
    }

    protected void ensureSize() {
        if(structure.length == internalSize) {
            T[] newData = (T[]) new Object [structure.length * 2];
        }
    }
}
