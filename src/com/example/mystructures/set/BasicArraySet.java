package com.example.mystructures.set;

import com.example.mystructures.AbstractArrayStructure;

public class BasicArraySet<T> extends AbstractArrayStructure<T> implements MySet<T> {

    public BasicArraySet() {
        super();
    }

    public BasicArraySet(T... structure) {
        super(structure);
    }

    @Override
    public boolean add(T t) {
        for (int i = 0; i < internalSize; i++) {
            T obj = structure[i];

            if (obj == null) {
                if (t == null) {
                    return false;
                }
                continue;
            }

            if (obj == t || obj.equals(t)) {
                return false;
            }
        }

        ensureSize();

        structure[internalSize++] = t;

        return true;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }
}