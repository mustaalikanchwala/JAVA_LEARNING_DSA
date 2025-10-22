//  Represents a function that accepts one argument and produces a result
/*
It's important to distinguish between static methods in an interface 
using the interface name, like InterfaceName.methodName()) and static fields in a class 
(which can be called directly from within the same class or from outside using the class 
name). In your code, addNumber, subtractNumber, and combinedFunction are static fields of 
the FunctionInterfaceDemo class, not static methods of the Function interface.​
*/
import java.util.function.Function;

public class FunctionInterfaceDemo {
    
    public static Function<Integer,Integer> addNumber = (a) -> a+1;
    public static Function<Integer,Integer> subtractNumber = (a) -> a-10;
    // we can use the above two method in once , by combining it.
    // This i called Chaining.
    public static Function<Integer,Integer> combinedFunction = addNumber.andThen(subtractNumber);

    public static void main(String[] args) {
        System.out.println(addNumber.apply(19));
        System.out.println(subtractNumber.apply(19));
        System.out.println(combinedFunction.apply(19));
    }
}
