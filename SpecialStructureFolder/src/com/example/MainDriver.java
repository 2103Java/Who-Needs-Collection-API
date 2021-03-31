package com.example;

import com.example.mystructures.lists.MyList;
import com.example.mystructures.queue.*;
import com.example.mystructures.queue.MyQueueAndListImpl;
import com.example.mystructures.set.MySet;
import com.example.mystructures.set.MySetImpl;

public class MainDriver {

	public static void main(String[] args) {

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
