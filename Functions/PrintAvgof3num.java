package Functions;

import java.util.*;
public class PrintAvgof3num {
    public static double AvgOf3Num(double a,double b, double c){
      return (a+b+c)/3;
    }
    public static void main(String abs[]){
        System.out.println("Enter 3 numbers to calc avg : ");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
 System.out.println(AvgOf3Num(num1,num2,num3));
    }
    
}
