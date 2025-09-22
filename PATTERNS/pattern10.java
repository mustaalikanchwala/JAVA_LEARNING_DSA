package PATTERNS;
import java.util.*;

public class pattern10 {
    public static void main(String abs[]) {
        int n = 8;
        int i, j, l, k;
        for (i = 1; i <=n; i++) {
            for (j = 1; j <=i; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (l = 1; l <= spaces; l++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (i = n; i >=1; i--) {
            for (j = 1; j <=i; j++) {
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            for (l = 1; l <= spaces; l++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
