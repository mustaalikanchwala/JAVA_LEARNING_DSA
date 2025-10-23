import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> Consumer1 = (str) -> System.out.println(str);
        // Method Refrence
        Consumer<String> Consumer2 = System.out::println;
        Consumer1.accept("hi");
        Consumer2.accept("hi");

        // Real Eg
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> Consumer3 = n -> System.out.println(n*100);
        numbers.forEach(Consumer3);
    }
}
