import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDeom {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,10,10,10,20,30,40,50,55);
        // reduce : sum up the value in collection and give one single value
        Stream<Integer> IntegerStream = numbers.stream();
        Stream<Integer> IntegerStream1 = numbers.stream();
        int sum = IntegerStream.reduce(0, (acc , num ) -> acc+num );
        // 0 indicate the starting value of sum 
        // acc means current value in sum
        // num means next value in Stream
        // using Method refrence
        int sum1 = IntegerStream1.reduce(0, Integer::sum);
        // Making More Shorter
        int sum2 = numbers.stream().reduce(0,Integer::sum);
        System.out.println("Integer Sum is : "+sum);
        System.out.println("Integer Sum is (Method refrence) : "+sum1);
        System.out.println("Integer Sum is More Shorter Version (Method refrence) : "+sum2);

        // collect();
        // List
        List<Integer> evenNumlist = numbers.stream().filter( n -> n%2 == 0).collect(Collectors.toList());
        System.out.println("Even Numbers List : "+ evenNumlist);
        // set
        Set<Integer> evenNumset = numbers.stream().filter( n -> n%2 == 0).collect(Collectors.toSet());
        System.out.println("Even Numbers Set : "+ evenNumset);

        // find & match
        // find First : return the first element from stream.
        // find any : return any element from stream.
        System.out.println("=======FIND First=======");
        System.out.println(numbers.stream().findFirst().get());
        System.out.println("=======FIND ANY=======");
        System.out.println(numbers.stream().findAny().get());
        // match chech in stream if we have the given value in stream or not
        // check if given value is match in stream value with any one 
        System.out.println("=======ANY Match=======");
        System.out.println(numbers.stream().anyMatch(n -> n == 40)); // true
        System.out.println(numbers.stream().anyMatch(n -> n == 401)); // false
        // .allMatch check the given value should match with all value present in stream
        System.out.println("=======ALL Match=======");
        System.out.println(numbers.stream().allMatch(n -> n == 40)); // false
        // .noneMatch return true if no element match with given value
        System.out.println("=======None Match=======");
        System.out.println(numbers.stream().noneMatch(n -> n == 40)); // false
        System.out.println(numbers.stream().noneMatch(n -> n == 401)); // true

        // itration
        System.out.println("=====ITERATION=====");
        numbers.stream().forEach(n -> System.out.println(n));

        
    }
}
