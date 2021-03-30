package assignment;

public abstract class Set<T> implements SpecialStructuresInterface<T> {
	
	private T[] internalArray;
	
	
	@Override
	public boolean isEmpty() {
		return this.internalArray.length == 0;
	}

	@Override
	public int getSize() {
		
		return this.internalArray.length;
	}

	@Override
	public boolean add(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		return false;
	}

}
