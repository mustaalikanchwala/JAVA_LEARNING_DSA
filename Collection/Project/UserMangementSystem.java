package Collection.Project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Collection.Project.User;
public class UserMangementSystem {
    public static void main(String[] args) {
        // Set<String> user1role = new HashSet<>(Arrays.asList("ADMIN","USER"));
        // User u1 = new User(1, "Mustaali", true,user1role );
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Mustaali", true,new HashSet<>(Arrays.asList("SUPER ADMIN")) ));
        users.add(new User(2, "Shubham", true,new HashSet<>(Arrays.asList("ADMIN")) ));
        users.add(new User(3, "Hussain", false,new HashSet<>(Arrays.asList("USER")) ));
        users.add(new User(4, "Soham", false,new HashSet<>(Arrays.asList("MANAGER")) ));
        
        // Removing The InActive user
        Iterator<User> it = users.iterator();
        while(it.hasNext()){
            if(!it.next().getIsActive()){
                it.remove();
            }
        }
        // Print Active User
        System.out.println("=== Active Users ===");
        for(User activeUser : users){
            activeUser.getAllDetail();
        }

// Enhanced for loop gets a role (e.g., "ADMIN") from the user​

// getOrDefault("ADMIN", 0) checks if "ADMIN" exists in the HashMap​

// First time: Role doesn't exist → returns default value 0, adds 1 → stores "ADMIN" with value 1​

// Second time: Role exists → returns existing value 1, adds 1 → updates "ADMIN" to 2
        // Counting per Role
        Map<String,Integer> roleCount = new HashMap<>();
        for(User user : users){  // taking each user object from list
            for(String role : user.getRoles()){
                roleCount.put(role, roleCount.getOrDefault(role, 0)+1);
            }
        }
        // System.out.println(roleCount); 

        // Printing The role Count
        System.out.println("=== ROLE COUNT ===");
        for(Map.Entry<String,Integer> entry : roleCount.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
