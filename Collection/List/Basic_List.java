import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Car{
    String Barnd;
    Car(String Brand){
        this.Barnd = Brand;
    }
}

public class Basic_List {
    public static void main(String[] args) {
        // here we have not defined the Type of list so we cann add all data types but it will store in form of object.
        // List user = new ArrayList<>();
        // user.add("Bob");
        // user.add(12);
        // user.add('D');
        // System.out.println(user); // we can print list diectly output : [Bob, 12, D].
        // If we have to store only similar data types then we have to define the type. This is called Genreics(<>)
        List<Integer> user = new ArrayList<Integer>();
        // user.add("mustaali"); // we cannot add String
        user.add(1);
        user.add(2);
        user.add(2); // duplicates are allowed
        System.out.println(user.get(2));

        // List Of Custom Objects

        Car c1 = new Car("BMW");
        Car c2 = new Car("Mercedes");
        Car c3 = new Car("Rolls Royec");
        List<Car> CarList = new ArrayList<Car>();
        CarList.add(c1);
        CarList.add(c2);
        CarList.add(c3);
        // System.out.println(CarList.get(0));  // this is only printing object of car
        for(Car car : CarList){
           System.out.println(car.Barnd);
        }


        // Traversing The List 
        List<String> names = new ArrayList<>();  
          names.add("Mustaali");
        names.add("Shubham");
        names.add("Hussain");
        names.add("Soham");

        // using For Loop
        System.out.println("=== For Loop ===");
        for(int i = 0 ; i<names.size();i++){
            System.out.println(names.get(i));
        }
        // Using Enhanced For Loop
        System.out.println("===Enhanced For Loop===");
        for(String name : names){
            System.out.println(name);
        }
        // Using Itrator
        // System.out.println("=== Iterator ===");
        // names is an object of ArrayList. Inside the ArrayList class, there is a private inner 
        // class (commonly named Itr) that implements the Iterator interface. When we call the 
        // iterator() method on names, it creates and returns a new object of this inner class, 
        // which we store in our Iterator<String> itr variable. 
        Iterator<String> it = names.iterator(); // we have to pass type for which we are itareting
        while (it.hasNext()) {
            // System.out.println(it.next());
            // using this we can update and remove the value
            if(it.next().equals("Soham")){
                it.remove();
            }
        }
        for(String name : names){
            System.out.println(name);
        }
    }
}
