package Functions;


import java.util.*;

public class Factorial {
//     public static int CalcFact(int n) {
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {

//             fact *= i;
//         }
//         return fact;
//     }
    // Alternate method
    // public class Factorial {
    public static void CalcFact(int n) {
        int fact = 1;
        if(n<0){
            System.out.println("Invalid number");
            return;
        }else if(n==0){ 
            System.out.println(fact);
            return;
        } else {
        
        for (int i = n; i >=1; i--) {

            fact *= i;
        }
       System.out.println(fact);
        return;
    }
    }

    public static void main(String abs[]) {
        System.out.println("Enter value to get factorial of it :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(CalcFact(n););  for First method
        CalcFact(n);

    }
}
