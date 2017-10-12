import java.util.*;

/// @author cowcutta ////

///Tree collections organize the data in an alphabetical order////
    public class collectionTree {
        public static void main(String[] args) {
            
            Set<String> set1 = new TreeSet<>();
            
            set1.add("Queen");
            set1.add("Metallica");
            set1.add("The Cars");
            set1.add("Tom Petty");
            set1.add("Pearl Jam");
            
            System.out.println(set1);
            
            ///Iteration///
            set1.stream().forEach((element) -> {
                System.out.println(element);
            });
        }
    }
