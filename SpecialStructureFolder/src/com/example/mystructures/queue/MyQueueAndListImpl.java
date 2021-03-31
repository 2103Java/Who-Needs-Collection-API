package com.example.mystructures.queue;

import com.example.mystructures.lists.*;

public class MyQueueAndListImpl<T> implements MyQueue<T>, MyList<T> {

	private T[] internalArray;

	public MyQueueAndListImpl(T... array) {
		// var-args are dynamic, and can accept any number of arguments

		this.internalArray = array;
	}

	// We inherit and modify the toString method
	@Override // provides metadata to the JVM, in this case to tell it that it's an inherited
				// method
	public String toString() {
		String s = "Here's the collection of objects: ";
		for (Object o : this.internalArray) {
			s += o + " ";
		}
		return s;
	}

	// QueueAdd Method
	@Override
	public boolean add(T t) {
		T[] newArray = (T[]) new Object[this.internalArray.length + 1];

		for (int i = 0; i < internalArray.length; i++) {
			newArray[i] = this.internalArray[i];
		}

		newArray[newArray.length - 1] = t;
		this.internalArray = newArray;

		return true;
	}

	@Override
	public int size() {

		return this.internalArray.length;
	}

	// List Index Add
	@Override
	public boolean add(T t, int index) {
		T[] newArray = (T[]) new Object[this.internalArray.length + 1];

		for (int i = 0; i < index; i++) {
			newArray[i] = this.internalArray[i];
		}

		newArray[index] = t;

		for (int i = index + 1; i < newArray.length; i++) {
			newArray[i] = this.internalArray[i - 1];
		}

		this.internalArray = newArray;

		return true;

	}

	// list get by index
	@Override
	public T get(int index) {
		T item = this.internalArray[index];

		return item;
	}

	// list get index by value
	@Override
	public int getIndex(T e) {

		for (int i = 0; i < this.internalArray.length; i++) {
			if (e == this.internalArray[i]) {
				return i;
			}
		}
		return -1;
	}

	// remove for List
	@Override
	public boolean remove(int index) {
		T[] newArray = (T[]) new Object[this.internalArray.length - 1];

		for (int i = 0; i < newArray.length; i++) {

			if (i >= index) {
				i++;
				newArray[i - 1] = this.internalArray[i];
			} else {
				newArray[i] = this.internalArray[i];

			}

		}
		this.internalArray = newArray;

		return false;
	}

	@Override
	public boolean update(T e, int index) {
		T[] newArray = (T[]) new Object[this.internalArray.length];

		for (int i = 0; i < newArray.length; i++) {

			if (i == index) {

				newArray[i] = e;
			} else {
				newArray[i] = this.internalArray[i];

			}

		}
		this.internalArray = newArray;

		return false;
	}

	// remove for Queue
	@Override
	public boolean remove() {
		T[] newArray = (T[]) new Object[this.internalArray.length - 1];

		for (int i = 1; i < this.internalArray.length; i++) {
			newArray[i - 1] = this.internalArray[i];
		}
		this.internalArray = newArray;
		return false;
	}

}
