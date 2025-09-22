package Functions;
import java.util.*;

public class CalcCircumference {
    public static double calccircum(int r){
        double circum = 2*3.14*r;
        return circum;
    }
    public static void main(String abs[]){
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println(calccircum(r));
    }
}
