package com.example.mystructures.set;

public class MySetImpl<T> implements MySet<T> {

	private T[] internalArray;
	
	public MySetImpl(T... array) {
		this.internalArray = array;
		
	}
	
	@Override
	public boolean add(T t) {
		
		T[] newArray = (T[]) new Object[this.internalArray.length + 1];
		
		for(int i = 0; i < internalArray.length; i++) {
			if (internalArray[i] == t) {
				return false;
			}
			newArray[i] = this.internalArray[i];
			}
		
		newArray[newArray.length - 1] = t;
		this.internalArray = newArray;
		
		return true;
	}

	@Override
	public int size() {
		return internalArray.length;
	}

	@Override
	public boolean remove(T t) {
		T[] newArray  = (T[]) new Object[this.internalArray.length -1];

		int index = 0;
		
		//Setting given element to null
		for(int i = 0; i < internalArray.length; i++) {
			
			if(internalArray[i].equals(t)) {
				newArray[i] = this.internalArray[i+1];
				index = i;
				break;
				
			}else {
				newArray[i] = this.internalArray[i];
			}
			
			
			
		}
		
		for(int i = index ; i <newArray.length; i++) {
			newArray[i] = this.internalArray[i+1];
		}
		
		
		
		this.internalArray = newArray;
		
		return true;
	}

	@Override
	public String toString() {
		String aString = "";
		for (T t : internalArray) {
			if (t != null)
				aString += t.toString() + " ";
			else
				aString += "null ";
		}
		return aString;
		
	}
}
