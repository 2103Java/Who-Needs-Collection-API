package assignment;

public abstract class RootStructure<T> implements SpecialStructuresInterface<T> {
	
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
	public boolean contains(T t) {
		for(T mem: this.internalArray) {
			if (mem.equals(t)){
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		T[] newArray = (T[]) new Object[0];
		this.internalArray = newArray;
	}
	
	
	public T[] getStructure() { return this.internalArray; }
	public void setStructure(T[] t) {this.internalArray = t;};
}
