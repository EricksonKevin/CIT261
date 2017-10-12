import java.util.*;

public class CollectionMap {

   ////@author cowcutta////
    
    public static void main(String[] args) {
        
        //////creates an empty map/////////
        Map map = new HashMap();
        
        ///////add items to the map///////
        map.put("Genre", "Classic Rock");
        map.put("Year","1971");
        map.put("RPM", "45");
        map.put("Band", "Queen");
        
       
        /////change year value/////
        map.put("Year", "1977");
        
        /////print all items/////
        System.out.println(map);
        
        //////get one item from map/////
        System.out.println(map.get("Genre"));
        
        Set<String> keys = map.keySet();
        
        keys.stream().forEach((key) -> {
            System.out.println(key + " is " + map.get(key));
        });
    }
}