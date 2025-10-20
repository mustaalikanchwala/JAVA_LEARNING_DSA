import java.util.HashSet;
import java.util.Set;

public class Basic_Set {
    public static void main(String[] args) {
        Set<String> roles = new HashSet<>();
        roles.add("ADMIN");
        roles.add("Manager");
        roles.add("USER");

        System.out.println(roles);
        for(String role : roles){
            System.out.println("ROLE : "+role);
        }
        
    }
}
