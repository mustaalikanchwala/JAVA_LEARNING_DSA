import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
    BiConsumer<String,Integer> printInfo = (name,age) -> System.out.println("Hi! iam  "+name+"My age is "+age);
    printInfo.accept("Mustaali",19);   
    }

   
}
