package com.example;

import java.util.Set;

import com.example.mystructures.lists.MyList;
import com.example.mystructures.lists.MyListImpl;
import com.example.mystructures.queue.*;
import com.example.mystructures.queue.MyQueueAndListImpl;
import com.example.mystructures.set.MySet;
import com.example.mystructures.set.MySetImpl;

public class MainDriver {

	public static void main(String[] args) {

		/*
		 * What is an array in Java?
		 * 
		 * Collection of same data elements, they can be primitives or Objects
		 * 
		 * Arrays are indexed, they start from 0
		 * 
		 * Arrays are immutable - their lengths don't change.
		 * 
		 * They don't have any utility methods
		 * 
		 * You can iterate through an array
		 * 
		 * 
		 * 
		 */
		//
		// String[] arrayOfStrings = new String[10];
		// Integer[] arrayOfInts = {1,2,3};
		//
		/*
		 * int takes 32 bits of information
		 * 
		 * Integer is an object, wrapped around an int. This means we get some methods
		 * with it!
		 */
		//
		// int i1 = 2; //primitive variable
		// Integer i2 = 4; //reference variable
		//
		// i1. no methods
		// i2. lots of methods
		//
		//
		// int a = arrayOfStrings.length; //this is not a method, just a property
		//
		// arrayOfStrings. arrays only have Object Class methods
		//
		// java.lang.reflect.Array.set(arrayOfStrings, 2, "Hello");
		// java.lang.reflect.Array.set(arrayOfStrings, 1, "Hi");
		//
		// arrayOfStrings[4] = "Hallo";
		//
		// System.out.println(arrayOfStrings[1]);
		// System.out.println(arrayOfStrings[2]);
		//
		// for(String s: arrayOfStrings) {
		// System.out.println(s);
		// }
		//
		// for(int t: arrayOfInts) {
		// System.out.println(t);
		// }

		// String s = "Hello";
		// Object o = 3;

		// Turning a primitive into a object, is boxing. (Autoboxing is implicit)

		// Double b = 2.0; //implicit
		// double b2 = b; //

		// Object o2 = new Object();

		// System.out.println(o);
		// System.out.println(o2);

		// String s1 = (String) new Object();

		// MyList<String> stringMyList = new
		// MyListImpl<String>("Apples","Kiwi","Berries");

		// MyList<Integer> integerList = new MyListImpl<Integer>(1,2,3,4,5,6);

		// MyListImpl<Book> bookList = new BenImpl<>(); this doesn't work
		// MyList<Book> bookList = new BenImpl<>(); this does

		// stringMyList.add("Banana");
		// stringMyList.add("Dragon Fruit");

		// System.out.println(stringMyList.toString());

		// Set<String> a;

		MyQueue<String> queue1 = new MyQueueAndListImpl<String>("bob", "john", "tony");

		System.out.println(queue1.toString());// prints newly created queue

		queue1.add("billy");
		System.out.println(queue1.toString());// prints queue with billy added to end

		System.out.println(queue1.size());// length of queue/list

		MyList<String> list1 = new MyQueueAndListImpl<String>("bird", "cat", "dog");
		System.out.println(list1.toString());// prints newly created list

		list1.add("rabbit", 1);
		System.out.println(list1.toString());// prints list with added rabbit

		System.out.println(list1.getIndex("cat"));// prints the index of the cat

		list1.remove(2);
		System.out.println(list1.toString());// prints list with the cat removed

		list1.update("rat", 0);
		System.out.println(list1.toString());// prints list with an update to index 0

		queue1.remove();
		System.out.println(queue1.toString());// removes first index from list

		MySet<String> vegetables = new MySetImpl<String>("potato", "broc", "carrot"); // creates new Set
		System.out.println(vegetables.toString());// prints the newly created set

		System.out.println(vegetables.size());// prints Set length

		vegetables.remove("broc");
		System.out.println(vegetables.toString());// prints set showing the item was removed
	}

}
