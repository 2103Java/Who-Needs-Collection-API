package assignment;

public class Set<T> extends RootStructure<T> {

    public Set(T... array ) {
		//var-args are dynamic, and can accept any number of arguments
		setStructure(array);
	}
    
    /**
	 * Adds an element to the end of a new array and replaces it
	 */
    @Override
    public boolean add(T t) {
            T[] newArray = (T[]) new Object[getStructure().length + 1];
            
            for(int i = 0; i < getStructure().length; i++) {
                    newArray[i] = getStructure()[i];
            }
            newArray[newArray.length - 1] = t;
            setStructure(newArray);
            
            return false;
    }
    
    /**
    * Subjects a specified element by making 2 arrays and replacing
    * the original with a new array that doen't not hava a specified
    * element, t
    */
    public boolean remove(T t) {
            
            T[] newArray = (T[]) new Object[getStructure().length-1];

            for(int i=0, j=0; i < getStructure().length; i++) {
                    if(getStructure()[i].equals(t)) 
                            newArray[j++] = getStructure()[i];
            }
            setStructure(newArray);
            
            return false;
    }

}
