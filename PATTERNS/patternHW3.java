package PATTERNS;
import java.util.*;

public class patternHW3 {
    static int factorial(int n) {
        int fact = 1;
        for(int i  = 1; i<=n;i++){
          fact*=i;
        }
        return fact;
    }
    static int combination(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    
    public static void main(String abs[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            } 
            for(int j = 1;j<=i;j++){
                int value = combination(i-1,j-1); //if starts i and j with zero than -1 is not needed
                System.out.print(value+" ");
            }

            System.out.println();
        }

    }

}