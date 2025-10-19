// Records are immutable, meaning once you create them, you cannot change their values. Records 
// are final, so you cannot extend them. They automatically provide useful methods like equals()
// for comparing objects. Records can implement interfaces and have methods inside them if needed.

record Person(String Name , int Age) {}

public class Records {
    public static void main(String[] args) {
        Person mustaali = new Person("Mustaali", 19);
       System.out.println(mustaali.Age());
        System.out.println(mustaali.Name());
        System.out.println(mustaali);
    }
    
}
