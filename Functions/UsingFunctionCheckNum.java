package Functions;
import java.util.*;
public class UsingFunctionCheckNum{
  public static void CheckNumType(int n){
    if(n%2==0){
        System.out.println("EVEN NUM");
    }else {
        System.out.println("ODD NUM");
    }
}
public static void main(String abs[]){
    System.out.println("ENter num to check type:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    CheckNumType(n);
}
  
} 