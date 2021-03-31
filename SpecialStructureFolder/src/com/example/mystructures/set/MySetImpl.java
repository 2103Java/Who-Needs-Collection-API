package com.example.mystructures.set;

public class MySetImpl<T> implements MySet<T> {

	private T[] internalArray;

	public MySetImpl(T... array) {
		this.internalArray = array;
	}

	@Override // provides metadata to the JVM, in this case to tell it that it's an inherited
				// method
	public String toString() {
		String s = "Here's the Set: ";
		for (Object o : this.internalArray) {
			s += o + " ";
		}
		return s;
	}

	@Override
	public boolean add(T t) {
		T[] newArray = (T[]) new Object[this.internalArray.length + 1];
		for (int i = 0; i < this.internalArray.length; i++) {
			if (t == this.internalArray[i]) {
				System.out.println("Error: Duplicate Found at index " + i);
				break;
			}
			newArray[i] = this.internalArray[i];
		}
		newArray[newArray.length - 1] = t;
		this.internalArray = newArray;
		return false;
	}

	@Override
	public int size() {

		return this.internalArray.length;
	}

	@Override
	public boolean remove(Object t) {
		T[] newArray = (T[]) new Object[this.internalArray.length - 1];
		boolean b = false;

		for (int i = 0; i < this.internalArray.length; i++) {
			if (b) {
				newArray[i - 1] = this.internalArray[i];
			} else if (this.internalArray[i] == t) {
				i++;
				newArray[i - 1] = this.internalArray[i];
				b = true;
			} else {
				newArray[i] = this.internalArray[i];

			}

		}
		this.internalArray = newArray;

		return false;
	}

}
