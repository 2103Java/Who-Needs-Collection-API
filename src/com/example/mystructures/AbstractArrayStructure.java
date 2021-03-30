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

        if (structure.length == 0) {
            this.structure = (T[]) new Object[8];
            internalSize = 8;
        }
    }

    protected void ensureSize() {
        if (structure.length == internalSize) {
            T[] newData = (T[]) new Object[structure.length * 2];

            System.arraycopy(structure, 0, newData, 0, structure.length);

            structure = newData;
        }
    }

    @Override
    public int size() {
        return internalSize;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Here's the list of objects: ");

        for (int i = 0; i < internalSize; i++) {
            s.append(structure[i]).append(' ');
        }

        return s.toString();
    }
}