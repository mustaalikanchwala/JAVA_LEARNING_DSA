import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class EgOnFunction {
    public static void main(String[] args) {
        // Eg to format some String
        BiFunction<String,Double,String> formating = (title,cost) -> title+" : Cost $"+cost;
        System.out.println(formating.apply("Mustaali the great developer ", 999999999999.999999999999999999999));

        BiConsumer<String,Double> formatter = (title,cost) -> System.out.println(title+" : Cost $"+cost);
        formatter.accept("the Og java developer by mustaali kanchwala ", 999999999999.99999999999999999999999);

        // Eg on to check wheather the object is expensive or not;
        Predicate<Double> IsExpensive = (price) -> price>500;
        System.out.println(IsExpensive.test(999.0));
        System.out.println(IsExpensive.test(99.0));
    }
}
