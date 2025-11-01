import java.util.Optional;

public class NullPointerException {
    public static void main(String[] args) {
        String name  = null;
        // how we handel null exception befor optionals , traditinal java
        System.out.println("Handeling null exception in traditional way , before optional in java ");
        System.out.println("Not right way to handel null exception");
        if( name != null )
            System.out.println(name);
        else
            System.out.println("No name present");
            
            // Optional introduced in java 8
            // Creating optional
            System.out.println("Optional String");
            Optional<String> optionalString = Optional.of("Java");
            System.out.println(optionalString);
            
            // empty optional
            System.out.println("Optional Empty");
            Optional<String> empty = Optional.empty();
            System.out.println(empty);
            
            // Null value optional 
            System.out.println("Optional may be null");
            Optional<String> maybeNull = Optional.ofNullable(null);
            System.out.println(maybeNull);

            // Checking Values
            System.out.println(optionalString.isPresent()); // true
            System.out.println(empty.isEmpty()); // true
            System.out.println(maybeNull.isPresent()); // false
            System.out.println(maybeNull.isEmpty()); // true
            
            // to get value
            // it is not right way to get the value from optional because if value is null we get the null exception
            System.out.println(optionalString.get());
            // System.out.println(maybeNull.get());   // getting null exception

            // how to get value from optional safely
            // orElse("") if value is present then that value will show if value is null or empty then our hardcoded/default value will be show.
            System.out.println("USING orElse");
            System.out.println(optionalString.orElse("Default"));  // print java 
            System.out.println(maybeNull.orElse("default")); // default

            // orElseGet(<supplier>) it takes a supplier , a function that will excute if no value or null is present in optional 
            System.out.println("USING orElseGet");
            String orelseget = maybeNull.orElseGet(() -> {
                System.out.println("Genrating the Value no. "+Math.floor(Math.random()+10));
                return "Value genrated";   // the optional is of string data type so we can only return string olny
            });
            System.out.println(orelseget);

            // orElseThrow : we can use this , if value is present the use the value if not then throw the exception.
            System.out.println("USING orElseThrow");
            String ORelseThrow = optionalString.orElseThrow(() -> new RuntimeException("No Value Found"));
            System.out.println(ORelseThrow);

        }

}
