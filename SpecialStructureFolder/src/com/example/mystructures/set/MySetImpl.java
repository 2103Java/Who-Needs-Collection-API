package com.example.mystructures.set;

public class MySetImpl<T> implements MySet<T>{

private T[] internalArray;
	
	public MySetImpl(T... array ) {
		this.internalArray = array;
	}
	
	@Override
	public boolean add(T t) {
		T[] newArray = (T[]) new Object[this.internalArray.length + 1];
		for(int i =0; i<this.internalArray.length; i++) {
			if(t==this.internalArray[i]) {
				System.out.println("Error: Duplicate Found at index " + i);
				break;
			}
			newArray[i] = this.internalArray[i];
		}
		newArray[newArray.length-1] = t;
		this.internalArray = newArray;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean remove(Object t) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
