package assignment;

public class ListQueue<E> implements MyList<E>, MyQueue<E>{
	
	private E[] internalArray;
	
	public ListQueue(E... array ) {
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


	@Override
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
	@Override
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

	@Override
	public boolean remove(int index) {
		
		E[] newArray = (E[]) new Object[this.internalArray.length - 1];
		
		this.internalArray[index] = null;
		
		for(int i = 0; i < this.internalArray.length ; i++) {
			newArray[i] = this.internalArray[i];
			
			if(this.internalArray[i] == null) {
				
			}
		}
		
		return false;
	}


	@Override
	public int getSize() {
		int sizeToReturn = -1;
		
		sizeToReturn = this.internalArray.length;
		
		return sizeToReturn;
	}


	@Override
	public boolean add(E e, int index) {
		boolean toReturn = false;
		
		this.internalArray[index] = e;
		
		if (this.internalArray[index] == e) {
			toReturn = true;
		}
		return toReturn;
	}


	@Override
	public E get(int index) {
		return this.internalArray[index];
	}
	@Override
	public boolean update(E e, int index) {
		boolean toReturn = false;
		
		this.internalArray[index] = e;
		
		if (this.internalArray[index] == e) {
			toReturn = true;
		}
		return toReturn;
	}
	
	@Override
	public boolean isEmpty() {
		boolean toReturn = false;
		
		for(int i = 0; i < this.internalArray.length ; i++) {
			if(this.internalArray[i] != null) {
				toReturn = true;
			}
		}
		
		return toReturn;
	}

	@Override
	public boolean enqueue(E e) {
		return add(e);		
	}

	@Override
	public boolean dequeue() {
		return remove(0);
	}


	@Override
	public boolean contains(E t) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}
}



