package com.example;

import com.example.mystructures.lists.BasicArrayList;
import com.example.mystructures.lists.MyList;

public class MainDriver {

    public static void main(String[] args) {
        MyList<String> stringMyList = new BasicArrayList<>("Apples", "Kiwi", "Berries");

        MyList<Integer> integerList;//= new MyListImpl<Integer>(1, 2, 3, 4, 5, 6);

        stringMyList.add("Banana");
        stringMyList.add("Dragon Fruit");


        System.out.println(stringMyList.toString());
    }
}