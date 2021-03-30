/**
 * 
 */
package assignment;

/**
 * @author Dante P, Ben M, Hassan S, Ancel N, Brady D
 *
 */
public class MainTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set smallSetTest = null;
		Set largeSetTest = null;
		
		System.out.println("Testing Set Data Structure");
		
		try {
			System.out.println("Adding to Set...");
			smallSetTest.add("First addition");
			smallSetTest.add("Second addition");
			smallSetTest.add("Third  addition");
			
			for(int i = 0; i < 100; i++) {
				largeSetTest.add(i);
			}
			System.out.println("Verifying getSize() method...");
			if(largeSetTest.getSize() != 100) {
				System.out.println("Set Test Failed: getSize() should return 100 for largeSetTest, instead returns: " + largeSetTest.getSize());
			}
			System.out.println("Verifying isEmpty() method...");
			if(smallSetTest.isEmpty()) {
				System.out.println("Set Test Failed: isEmpty() returned true when it should be false");
			}
			System.out.println("Verifying contains() method...");
			if(!largeSetTest.contains(5)) {
				System.out.println("Set test Failed: contains() is not finding value within the Set");
			}
			
			System.out.println("Verifying clear() method...");
			smallSetTest.clear();
			largeSetTest.clear();
			
			if(!smallSetTest.isEmpty()) {
				System.out.println("Set Test Failed: isEmpty() returning false when it should return true");
			}
			System.out.println("Set data structure is operating correctly");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		String[] list = {"head"};
		ListQueue smallListTest = new ListQueue(list);
		ListQueue largeListTest = new ListQueue(list);
		
		System.out.println("Testing List Data Structure");
		
		try {
			System.out.println("Adding to List");
			smallListTest.add("First addition");
			smallListTest.add("Second addition");
			smallListTest.add("Third  addition");
			
			for(int i = 0; i < 100; i++) {
				largeListTest.add(Integer.toString(i),i);
			}
			System.out.println("Verifying getSize() method...");
			if(largeListTest.getSize() != 100) {
				System.out.println("List Test Failed: getSize() should return 100 for largeSetTest, instead returns: " + largeSetTest.getSize());
			}
			System.out.println("Verifying isEmpty() method...");
			if(smallListTest.isEmpty()) {
				System.out.println("List Test Failed: isEmpty() returned true when it should be false");
			}
			System.out.println("Verifying contains() method...");
			if(!largeListTest.contains(5)) {
				System.out.println("List test Failed: contains() is not finding value within the Set");
			}
			System.out.println("Verifying clear() method...");
			smallListTest.clear();
			largeListTest.clear();
			
			if(!smallListTest.isEmpty()) {
				System.out.println("List Test Failed: isEmpty() returning false when it should return true");
			}
			System.out.println("List data structure is operating correctly");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		ListQueue smallQueueTest = new ListQueue(null);
		ListQueue largeQueueTest = new ListQueue(null);
		
		System.out.println("Testing Queue Data Structure");
		
		try {
			System.out.println("Adding to Queue");
			smallQueueTest.add("First addition");
			smallQueueTest.add("Second addition");
			smallQueueTest.add("Third  addition");
			
			for(int i = 0; i < 100; i++) {
				largeQueueTest.add(i);
			}
			System.out.println("Verifying getSize() method...");
			if(largeQueueTest.getSize() != 100) {
				System.out.println("Queue Test Failed: getSize() should return 100 for largeSetTest, instead returns: " + largeSetTest.getSize());
			}
			System.out.println("Verifying isEmpty() method...");
			if(smallQueueTest.isEmpty()) {
				System.out.println("Queue Test Failed: isEmpty() returned true when it should be false");
			}
			System.out.println("Verifying contains() method...");
			if(!largeQueueTest.contains(5)) {
				System.out.println("Queue test Failed: contains() is not finding value within the Set");
			}
			System.out.println("Verifying clear() method...");
			smallQueueTest.clear();
			largeQueueTest.clear();
			
			if(!smallQueueTest.isEmpty()) {
				System.out.println("Queue Test Failed: isEmpty() returning false when it should return true");
			}
			System.out.println("Queue data structure is operating correctly");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
