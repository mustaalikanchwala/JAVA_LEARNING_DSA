import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiffrentSourceDemo {
    public static void main(String[] args) {
        //  From Collection eg : collection.stream();
        System.out.println("From Collection eg : collection.stream();");
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,6,7,8,8,900);
        Stream<Integer> evenLessthen = numbers.stream().filter(n -> n%2 == 0 && n<6);
        evenLessthen.forEach(System.out::println);

        // from Array Stream eg : Arrays.stream(array);
        // Method one using rimitive data type class
        System.out.println("from Array Stream eg : Arrays.stream(array); ");
        System.out.println("Method one using rimitive data type class");
        Integer [] arr = {1,2,3,4,5,6};
        Stream<Integer> arrayStream = Arrays.stream(arr); 
        arrayStream.forEach(System.out::println);
        // Method two using primitive data type
        System.out.println("Method two using primitive data type");
        int [] arr1 = {1,2,3,4,5,6};
        IntStream arrayIntStream = Arrays.stream(arr1);
        arrayIntStream.forEach(System.out::println);

        // From Specific Value 
        Stream<String> specificValue = Stream.of("a","b","c");
        // Infine Stream
        Stream<Integer> infiniteStream = Stream.iterate(0,n -> n+2);
        // From File 
        // Stream<String> filStream = Files.lines(Path.of('add/an/actual/path/here'));
        

    }
}
