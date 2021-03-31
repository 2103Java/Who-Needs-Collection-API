package com.example;

import java.util.Set;


import com.example.mystructures.lists.MyListAndQ;
import com.example.mystructures.queue.MyQueue;
import com.example.mystructures.lists.ListAndQAbstract;


public class MainDriver {
	
	public static void main(String[] args) {
		

			

		
		
		ListAndQAbstract<String> stringMyList = new MyListAndQ<String>("hi","hi","hi");
		

		stringMyList.Print();
		
		stringMyList.add("Hello",1);
		
		stringMyList.Print();
		
		MyQueue<Integer> intQ = new MyListAndQ<Integer>(1,2,3);
		
		int a = intQ.remove();
		
		System.out.print(a);
		

	
		

		
	}

}
