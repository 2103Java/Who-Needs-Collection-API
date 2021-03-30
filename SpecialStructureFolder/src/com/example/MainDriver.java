package com.example;

import java.util.Set;

import com.example.mystructures.lists.MyList;
import com.example.mystructures.lists.MyListImpl;
import com.example.mystructures.lists.MyListQueue;
import com.example.mystructures.queue.MyQueue;
import com.example.mystructures.set.MySet;
import com.example.mystructures.set.MySetImpl;

public class MainDriver {
	
	public static void main(String[] args) {
		
		MyList<String> aList = new MyListQueue<String>("Lorem ipsum", "something something");
//		MyQueue<String> aQueue = new MyListQueue<String>("It's just a jump to the left", "And then a step to the right");
		
//		MySet<String> aSet = new MySetImpl<String>("Don't try it Anakin", "I have the high ground!");
//		
//		aSet.add("Why hello there!");
//		aSet.add("GENERAL KENOBI!");
//		
//		System.out.println(aSet.toString());
//		
//		System.out.println(aSet.size());
//		
//		aSet.remove("I have the high ground!");
//		
//		System.out.println(aSet.toString());
		
		
		
//		aQueue.add("You put your hands on your hips");
//		
//		System.out.println(aQueue.toString());
//		
//		aQueue.remove();
//		System.out.println(aQueue.toString());
		
		
		aList.add("This is a string");
		aList.add("This is a string at index 2", 2);
		System.out.println(aList.toString());
		
		System.out.println(aList.get(2));
		
		System.out.println(aList.getIndex("This is a string at index 2"));
		
		aList.remove(2);
		System.out.println(aList.toString());
		
		aList.update("Yes please I want to be done", 0);
		System.out.println(aList.toString());
	}

}
