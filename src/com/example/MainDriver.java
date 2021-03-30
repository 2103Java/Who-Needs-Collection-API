package com.example;

import com.example.mystructures.lists.BasicArrayList;
import com.example.mystructures.lists.MyList;
import com.example.mystructures.queue.BasicArrayQueue;
import com.example.mystructures.queue.MyQueue;
import com.example.mystructures.set.BasicArraySet;
import com.example.mystructures.set.MySet;

public class MainDriver {

    public static void main(String[] args) {
        MyList<String> stringMyList = new BasicArrayList<>("Apples", "Kiwi", "Berries");
//        MyQueue<Integer> testQueue = new BasicQueue<>();
//
//        testQueue.add(12);
//        testQueue.add(5);
//
//        System.out.println(testQueue);

        stringMyList.add("Banana");
        stringMyList.add("Dragon Fruit");
        System.out.println(stringMyList.toString());

        MySet<Integer> intSet = new BasicArraySet<>(1, 2, 3, 4, 5, 6);



        System.out.println(intSet.add(null));
        System.out.println(intSet.add(7));
        System.out.println(intSet.add(1));

        System.out.println(intSet);

        MyQueue<String> myQueue = new BasicArrayQueue<>();
        myQueue.add("Hello");
        myQueue.add("World");
        myQueue.add("from");
        myQueue.add("Muhammad");

        System.out.println(myQueue.peak());
        System.out.println(myQueue.pop());

        System.out.println(myQueue);

    }
}