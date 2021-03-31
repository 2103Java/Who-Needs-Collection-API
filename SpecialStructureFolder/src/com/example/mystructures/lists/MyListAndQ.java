package com.example.mystructures.lists;

import com.example.mystructures.queue.MyQueue;

public class MyListAndQ<E> implements ListAndQAbstract<E> , MyQueue<E> {
	
	    private E[] internalArray;


	    public MyListAndQ(E... array ) {
	        //var-args are dynamic, and can accept any number of arguments

	        this.internalArray = array;
	    }


	    public boolean add(E e) {
	      
	        E[] newArray = (E[]) new Object[this.internalArray.length + 1];

	        for(int i = 0; i < internalArray.length; i++) {
	            newArray[i] = this.internalArray[i];
	        }

	        newArray[newArray.length - 1] = e;
	        this.internalArray = newArray;

	        return true;
	    }
	    
	    @Override
		public boolean add(E e, int index) {
			// TODO Auto-generated method stub
	    	
	    	if(index < internalArray.length)
	    	{
	    		internalArray[index] = e;
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    	
	    	
			
		}

	    public E get(int index)
	    {
	        boolean isNotNull = true;
	        E e = null;
	        if (internalArray[index]!= null)
	        {
	            isNotNull = true;
	            e = internalArray[index];
	            return e;
	        }
	        else 
	        {
	        	isNotNull = false;
	        	return e;
	        	
	        }
	    }




	    

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

	    public boolean remove(int index) {

//			E[] newArray = new E[this.internalArray.length - 1];

	        E[] newArray = (E[]) new Object[this.internalArray.length - 1];

	        this.internalArray[index] = null;

	        for(int i = 0; i < this.internalArray.length ; i++) {
	            newArray[i] = this.internalArray[i];

	            if(this.internalArray[i] == null) {

	            }
	        }



	        return false;
	    }

	    public boolean update(E e, int index)
	    {
	    	if(index>= internalArray.length)
	    	{
	    		return false;
	    		
	    	}
	    	else
	    	{
	    		internalArray[index] = e;
	    		
	
	    		return true;
	    	}
	    	
	    	
	    }




		@Override
		public void Print() {
			// TODO Auto-generated method stub
			
			int a = internalArray.length;
			
			for(int i=0; i<a; i++)
			{
				System.out.println(internalArray[i]);
			}
				
			
			
			
		}


		@Override
		public E remove() {
			// TODO Auto-generated method stub
			 E[] newArray = (E[]) new Object[this.internalArray.length - 1];

		        

		        for(int i = 0; i < this.internalArray.length -1; i++) 
		        {
		            newArray[i] = this.internalArray[i];
		        }
		        return this.internalArray[0];

		          
		}


		@Override
		public int size() {
			int a = internalArray.length;
			
			return a;
		}


		
}
