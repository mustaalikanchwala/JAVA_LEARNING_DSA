import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // Supplier does not take any arguments bu supply some value .
        Supplier<Double> randomNum = () -> Math.floor(Math.random()*100 + 1);
        // for fun
        for(int i = 0; i<100 ; i++){
            if(randomNum.get() == 0.0) break;
               System.out.println(randomNum.get());
        }
    }
}
