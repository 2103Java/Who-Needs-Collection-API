package com.example.mystructures.lists;

public abstract class MyListImpl<E>{
	
	private E[] internalArray;
	
	
	public MyListImpl(E... array ) {
		//var-args are dynamic, and can accept any number of arguments
		
		this.internalArray = array;
	}


	//We inherit and modify the toString method
	@Override //provides metadata to the JVM, in this case to tell it that it's an inherited method
	public String toString() {
		String s = "Here's the list of objects: ";
		for(Object o: this.internalArray) {
			s += o + " ";
		}
		return s;
	}



	public boolean add(E e) {
		// TODO Auto-generated method stub
		
//		E[] newArray = new E[this.internalArray.length + 1];
		
		E[] newArray = (E[]) new Object[this.internalArray.length + 1];
		
		for(int i = 0; i < internalArray.length; i++) {
			newArray[i] = this.internalArray[i];
		}
		
		newArray[newArray.length - 1] = e;
		this.internalArray = newArray;
		
		return true;
	}


	
	public int getIndex(E e) {
		
		int index = -1;
		
		for(int i = 0; i < this.internalArray.length ; i++) {
			if(this.internalArray[i].equals(e)) {
				index = i;
				break;
			}
		}
		return index;
	}

	
	public boolean remove(int index) {

//		E[] newArray = new E[this.internalArray.length - 1];
		
		E[] newArray = (E[]) new Object[this.internalArray.length - 1];
		
		this.internalArray[index] = null;
		
		for(int i = 0; i < this.internalArray.length ; i++) {
			newArray[i] = this.internalArray[i];
			
			if(this.internalArray[i] == null) {
				
			}
		}
		
		
		
		return false;
	}


	

}
