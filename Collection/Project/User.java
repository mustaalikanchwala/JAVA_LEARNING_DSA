package Collection.Project;

import java.util.Set;

public class User {
    private int id;
    private String name;
    private Boolean isActive;
    private Set<String> roles;
    
    public User(int id, String name, Boolean isActive, Set<String> roles) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.roles = roles;
    }
    public void getAllDetail(){
        System.out.println("ID : "+ id);
        System.out.println("NAME : "+ name);
        System.out.println("ROLE : "+ roles);
        System.out.println("IsActive: "+ isActive);
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
