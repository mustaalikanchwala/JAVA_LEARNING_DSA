import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Basic {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Mustaali","Shubham","Hussain","Soham");
        // without using Stream
        // we have to write loops 
        for(String item : items){
            System.out.println(item);
        }
        // we can use stream only once  iteams.stream can be used only once
        // using Streams
        Stream<String> usingStream = items.stream();
        usingStream.forEach((iteam) -> System.out.println(iteam));

        System.out.println("Filtered stream");
        Stream<String> stream1 = items.stream();
        // usingStream.filter((iteam) -> iteam.charAt(0) == 'S' );
        Stream<String> filteredStrem = stream1.filter((iteam) -> iteam.startsWith("M"));
        filteredStrem.forEach(System.out::println);
        // Shortcut Stream
        items.stream()
                    .filter((name) -> name.startsWith(("M")))
                    .forEach(System.out::println);

        // Taking only an even number from list using stream
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,6,7,8,9);
        List<Integer> evennums1 = new ArrayList<>();
        // Without Stream
        for(Integer num : nums){
            if(num%2 == 0){
                evennums1.add(num);
            }
        }
        System.out.println("Without Stream "+evennums1);
        // Using Stream Pipeline 
        // Only even number needed from above list 
        List<Integer> evenNum = nums.stream()
                                .filter((n) -> n%2 == 0)
                                .collect(Collectors.toList());
        System.out.println("Using Stream : "+evenNum);                                

    }
}
