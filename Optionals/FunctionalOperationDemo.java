import java.util.Optional;


public class FunctionalOperationDemo {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("JAVA");
        Optional<String> NullOptional = Optional.ofNullable("null");

        // ifPresnt() : if value is present then do some task , it take consumer function , Represents an operation that 
        // accepts a single input argument and returns no result
        System.out.println("====USING ifPresent()======");
        name.ifPresent( value -> System.out.println(value));
        name.ifPresent(System.out::println);
        NullOptional.ifPresent(System.out::println); // if value is null it will not print 
        
        // map() to trandform data 
        // String upperName = name.map( value -> value.toUpperCase());  here it will give error because map will return string 
        // but wrap in optional
        System.out.println("====USING map()======");
        Optional<String> upperName = name.map( value -> value.toUpperCase());
        System.out.println(upperName.orElse("no value , null"));
        
        //  filter();
        System.out.println("====USING filter()======");
       Optional<String> filteredname =  name.filter(n -> n.startsWith("J")); // If a value is present, and the value matches the given predicate, returns an Optional describing the value, otherwise returns an empty 
        filteredname.ifPresent(System.out::println);

        // sortcutway
        System.out.println("======SortCut Way======");
        name.filter(n -> n.startsWith("J")).ifPresent(System.out::println);

        // COMBINED OPERATION
        System.out.println("======COMBINED OPERATION======");
        name.filter( n -> n.startsWith("J")).map( n -> n.toUpperCase()).ifPresent(System.out::println);
    }
}
