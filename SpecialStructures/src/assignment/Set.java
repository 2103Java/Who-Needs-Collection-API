package assignment;

public class Set<T> extends RootStructure<T> {

    public Set(T... array ) {
		//var-args are dynamic, and can accept any number of arguments
		//setStructure(array);

		/*
		 * If an array with duplicates is passed in, remove the extras as per requirements of a Set
		 */
    	int uniqueElementCount = 0;
    	
		// Null the duplicates of elements in array
        for (int j = 0; j <= array.length - 1; j++) {
            for (int i = j + 1; i <= array.length - 1; i++) {
                if (array[j] == array[i]) {
                    array[i] = null;
                }
            }
        }
        // Count how many non null elements remain
        for (int i = 0; i < array.length; i++) {
        	if (array[i] != null) {
        		uniqueElementCount++;
        	}
        }
        // Create a duplicate free array
        T[] duplicateFreeArray = (T[]) new Object[uniqueElementCount];
        int duplicateFreeArrayIndex = 0;
        for (int i = 0; i <= array.length - 1; i++) {
        	if (array[i] != null) {
        		duplicateFreeArray[duplicateFreeArrayIndex] = array[i];
        		duplicateFreeArrayIndex++;
        	}
        }
        
        setStructure(duplicateFreeArray);
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
    
    public T get(int i) {
    	return getStructure()[i];
    }

}
