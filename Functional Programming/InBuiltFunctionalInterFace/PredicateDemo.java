// Predicate Accept some arguments and return some Boolean value

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // It accept Single argument and retur boolean Value
     Predicate<Integer> IsEven = n -> n%2 == 0;       
     System.out.println(IsEven.test(10));
     System.out.println(IsEven.test(101));

     BiPredicate<Integer,Integer> IsGreater = (n,m) -> n>m;
     System.out.println(IsGreater.test(12, 13));
     System.out.println(IsGreater.test(13, 12));

    }
}
