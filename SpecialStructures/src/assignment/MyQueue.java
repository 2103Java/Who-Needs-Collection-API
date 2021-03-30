package assignment;

public interface MyQueue<T> extends SpecialStructuresInterface<T> {
	
	//public T remove();
	
	boolean enqueue(T e);
	boolean dequeue();
}
