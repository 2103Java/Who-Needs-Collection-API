package assignment;

public interface MyList<E> extends SpecialStructuresInterface<E> {
	
	double pi = 3.14;
	
	boolean add(E e, int index);
	
	E get(int index);
	
	int getIndex(E e);
	
	boolean remove(int index);
	
	boolean update(E e, int index);
	
}
