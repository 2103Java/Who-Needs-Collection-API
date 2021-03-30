package com.example.mystructures.lists;

import com.example.mystructures.queue.MyQueue;

public class MyListQueue<E> implements MyList<E>, MyQueue<E> {

	private E[] internalArray;
	
	
	public MyListQueue(E... array) {
		this.internalArray = array;
		
	}
	
	@Override
	public boolean add(E e) {
		E[] newArray = (E[]) new Object[this.internalArray.length + 1];
		
		for(int i = 0; i < internalArray.length; i++) {
			newArray[i] = this.internalArray[i];
			}
		
		newArray[newArray.length - 1] = e;
		this.internalArray = newArray;
		
		return true;
	}
	
	@Override
	public int size() {
		return internalArray.length;
	}

	@Override
	public E remove() {
		//Queue Remove
		E[] newArray = (E[]) new Object[this.internalArray.length - 1];
		
		for(int i = 1; i < internalArray.length; i++) {
			newArray[(i-1)] = this.internalArray[i];
		}
		
		this.internalArray = newArray;
		
		return null;
	}

	@Override
	public boolean add(E e, int index) {
		//List add at provided index
		E[] newArray = (E[]) new Object[this.internalArray.length + 1];
		
		newArray[index] = e;
		
		//This copies all values before provided index
		for(int i = 0; i < index; i++) {
			newArray[i] = this.internalArray[i];
		}
		
		//This copies all values at and after provided index
		for(int i = index; i < internalArray.length; i++) {
			newArray[i+1] = this.internalArray[i];
		}
		
		this.internalArray = newArray;
		
		return true;
	}

	@Override
	public E get(int index) {
		if(internalArray.length <= index || index < 0) {
			return null;
		}
		else
			return internalArray[index];
	}

	@Override
	public int getIndex(E e) {
		// Iterates through the loop and finds index of provided element.
		for(int i = 1; i < internalArray.length; i++) {
			if (internalArray[i] == e)
				return i;
		}
		
		return 0;
	}

	@Override
	public boolean remove(int index) {
		if(internalArray.length <= index || index < 0) {
			return false;
		}
		else {
			E[] newArray = (E[]) new Object[this.internalArray.length - 1];
		
			//Copies values before the index
			for(int i = 0; i < index; i++) {
				newArray[i] = this.internalArray[i];
			}
			
			//Copies values at and after index.
			for(int i = index; i < newArray.length; i++) {
				newArray[i] = this.internalArray[i+1];
			}
			
			
			this.internalArray = newArray;
			
			return true;
		}
	}

	@Override
	public boolean update(E e, int index) {
		
		if(internalArray.length <= index || index < 0) {
			return false;
		}
		else {
			internalArray[index] = e;
		
			return true;
		}
	}
	
	@Override
	public String toString() {
		String aString = "";
		for (E e : internalArray) {
			if (e != null)
				aString += e.toString() + " ";
			else
				aString += "null ";
		}
		return aString;
		
	}
	
}
