MyDataStructures is a java project mimicing the Java Collection. Within the project a RootDataStructure interface is implemented with a Set, List, and Queue style data structures.

MainDriver.java
The main of the program which demonstrates and tests our defined Set, List, and Queue data structures. 

RootDataStructure.java
An interface which describes the shared behaviors of Set, List, and Queue including
add(), isEmpty(), contains(E e), and clear().

MyList.java, MyQueue.java and MyListImpl.java
The source files for the List and Queue data structures. MyListImpl is a class which allows testing of both the List and Queue data structures. The List data structure allows for storing, deleting, or retrieving data by index or value whereas the Queue data strucutre follows a strict first-in, first out order for storing and retrieving elements.   

