package com.example;

import java.util.Set;


import com.example.mystructures.lists.MyListAndQ;
import com.example.mystructures.lists.ListAndQAbstract;


public class MainDriver {
	
	public static void main(String[] args) {
		

			
//		String[] array = new String[] {"Hello","Hi","Place"};
//		for(int i=0; i < 3; i++)
//			{
//			System.out.println(array[i]);
//			}
		
		
		
		ListAndQAbstract<String> stringMyList = new MyListAndQ<String>("hi","hi","hi");
		
		System.out.println(stringMyList);
		
		stringMyList.Print();

		
		
		//stringMyList.add("String");
		
	
		
//		int a = stringMyList.size();
		
//		for(int i=0; i < a; i++)
//		{
//			
//			System.out.println(i);
//			System.out.println(a);
//			System.out.println(newArray[i]);
//		}
		
		
		
		
		//MyListAndQ<Integer> array = new MyListAndQ<Integer>();
		
		
		//array.add(1);
		//System.out.println(array.toString());
		
		
		
		

		
	}

}
