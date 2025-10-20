// Concept            |  Explanation                                                |  Example                                                 
// -------------------+-------------------------------------------------------------+----------------------------------------------------------
// Map                |  Stores data in key-value pairs (like a dictionary)         |  Map<Integer, String> user = new HashMap<>();            
// entrySet()         |  Returns a Set of all key-value pairs in the Map            |  user.entrySet()returns[(1=Alice), (2=Bob)]              
// Map.Entry          |  Represents a single key-value pair from the Map            |  Map.Entry<Integer, String> entryholds(1=Alice)          
// getKey()           |  Returns the key from a Map.Entry object                    |  entry.getKey()→ returns1                                
// getValue()         |  Returns the value from a Map.Entry object                  |  entry.getValue()→ returns"Alice"                        
// setValue(V value)  |  Updates the value in the Map.Entry (and the original Map)  |  entry.setValue("New Name")changes value to"New Name"    
// For-each loop      |  Iterates through each Map.Entry in the entrySet            |  for (Map.Entry<Integer, String> entry : user.entrySet())



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basic_Map {
    public static void main(String[] args) {
        Map<Integer,String> user = new HashMap<>();
        user.put(1, "Mustaali");
        user.put(2, "Shubham");
        user.put(3,"Hussain");
        user.put(4, "Soham");

        // Itrating 
        // Using For Loop
        for(int i = 1;i<=user.size();i++){
            System.out.println( "get user with the key  : "+user.get(i));
        }
        // Using Enhanced For Loop
        for(Map.Entry<Integer,String> entry : user.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
        
         System.out.println(user); // we can print map like this also

    }
}


