package com.example.mystructures.queue;

import com.example.mystructures.AbstractArrayStructure;
import com.example.mystructures.lists.BasicArrayList;
import com.example.mystructures.lists.MyList;

public class BasicArrayQueue<T> extends BasicArrayList<T> implements MyQueue<T>  {

    @Override
    public T peak() {
        return structure[0];
    }

    @Override
    public T pop() {
        T removedEle = structure[0];
        for (int i = 0; i < internalSize; i++)
            structure[i] = structure[i+1];
        internalSize--;
        return removedEle;
    }

}
