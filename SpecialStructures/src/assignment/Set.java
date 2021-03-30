package assignment;

public class Set<T> extends RootStructure<T> {

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
