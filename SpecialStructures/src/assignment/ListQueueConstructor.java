package assignment;

public class ListQueueConstructor<T> extends RootStructure<T> {
	
	String containerType;
	
	public ListQueueConstructor(String thisType) {
		this.containerType = thisType;
	}
	
	@Override
	public boolean add(T t) {
		T[] newArray = (T[]) new Object[this.getStructure().length + 1];
		
		for(int i = 0; i < this.getStructure().length; i++) {
			newArray[i] = this.getStructure()[i];
		}
		
		newArray[newArray.length - 1] = t;
		this.setStructure(newArray);
		
		return true;
	}
	
	public T remove() throws Exception {
		if(this.containerType == "list") {
			throw new Exception("You need to specify an index to remove from a list.");
		} else {
			T toReturn = this.getStructure()[0];
			T[] newArray = (T[]) new Object[this.getStructure().length - 1];
			
			for(int i = 1; i < this.getStructure().length ; i++) {
				newArray[i-1] = this.getStructure()[i];
			}
			this.setStructure(newArray);
			return toReturn;
		}
	}
	
	public T remove(int ind) throws Exception {
		if(this.containerType == "queue") {
			throw new Exception("You can not specify an index to remove from a queue.");
		} else {
			T toReturn = this.getStructure()[ind];
			T[] newArray = (T[]) new Object[this.getStructure().length - 1];
			
			for(int i = 0; i < this.getStructure().length ; i++) {
				if(i < ind) {
					newArray[i] = this.getStructure()[i];
				} else if (i > ind) {
					newArray[i-1] = this.getStructure()[i];
				}
				
			}
			this.setStructure(newArray);
			return toReturn;
			
		}
	}
	
	
}
