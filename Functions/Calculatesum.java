package Functions;
import java.util.*;
public class Calculatesum {
    public static int CalculateSum(int a,int b){
        int result = a+b;
        return result;
    }
    
    public static int CalculateProduct(int a,int b){
        int result = a*b;
        return result;
    }
    public static void main(String abs[]){
        System.out.println("Enter two number to ADD and MULTIPLY");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("The sum of two number is: "+CalculateSum(n, m));
        System.out.println("Product of two number is : "+CalculateProduct(n, m));

    }
}
