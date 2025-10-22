import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefrencesDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Mustali","Shubham","Hussain","Soham");

        // To print the each name from list we can use for loop , enhancesd for loop 
        // And also method refrences also,going step by step to it.
        // for each accepts a consumer object , consumer object accepts an input and does not return.
        // Consumer is Inbuilt Functional interface
        System.out.println("using normal anonyamus class"); 
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        System.out.println("using the Lambda expression");
        names.forEach((String name) ->{
            System.out.println(name);
        });

        System.out.println("making it more smaller ");
        names.forEach( name -> System.out.println(name));

        System.out.println("Using method refrences ");
    // This code takes each element from the names collection and prints it on a new line. 
    // The System.out::println part is a shorter way of writing a lambda expression.
        names.forEach(System.out::println );
    }
}
