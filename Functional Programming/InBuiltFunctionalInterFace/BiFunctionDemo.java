import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo{
    // we are defining static here because we can call this method directly , if we dont define static we hve to create the object of class then call.
    public static BiFunction<Integer,Integer,Integer> addTwoNum = (a,b) -> a+b;
    // By using Method Refrence
    public static BiFunction<Integer,Integer,Integer> addTwoNum1 = Integer::sum;

    public static BiFunction<Integer,Integer,Integer> subTwoNum = (a,b) -> a-b;
    // Fuction
    public static Function<Integer,Integer> multiply = x -> x*2;
    // Combined Function
    public static BiFunction<Integer,Integer,Integer> combinedFunction = addTwoNum.andThen(multiply);
    
    public static void main(String[] args) {
        System.out.println(addTwoNum.apply(28,6));
        System.out.println(subTwoNum.apply(28,6));
        System.out.println(addTwoNum1.apply(28,6));
        System.out.println(multiply.apply(6));
        System.out.println(combinedFunction.apply(28,6));
    }
}