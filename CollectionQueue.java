import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
/////@author cowcutta/////

public class CollectionQueue {
    
    public static void main(String[] args) {
    
        ////assigns a set size to the queue/////
    Queue<Integer> year = new ArrayBlockingQueue<>(5);
    
    year.add(1970);
    year.add(1971);
    year.add(1972);
    year.add(1973);
    year.add(1974);
    
    
    ///catches runtime error when trying to add more than five items////
    try {
     year.add(1975);
    }catch (IllegalStateException e) {
          System.out.println("Tried to add too many items to the queue.");      
                }
    
    ///prints out each item in the queue/////
    year.stream().forEach((value) -> {
        System.out.println("Queue value: " + value);
        });
    
    ///Remove item on list   First in, First Out////
    
    Integer value;
    value = year.remove();
    System.out.println("This was removed from the queue: " + value);
    
    
    
    }    
}
