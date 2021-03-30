package com.example;

import com.example.mystructures.lists.BasicArrayList;
import com.example.mystructures.lists.MyList;
import com.example.mystructures.set.BasicArraySet;
import com.example.mystructures.set.MySet;

public class MainDriver {

    public static void main(String[] args) {
        MyList<String> stringMyList = new BasicArrayList<>("Apples", "Kiwi", "Berries");

        stringMyList.add("Banana");
        stringMyList.add("Dragon Fruit");
        System.out.println(stringMyList.toString());

        MySet<Integer> intSet = new BasicArraySet<>(1, 2, 3, 4, 5, 6);

        System.out.println(intSet.add(null));
        System.out.println(intSet.add(7));
        System.out.println(intSet.add(1));

        System.out.println(intSet);
    }
}