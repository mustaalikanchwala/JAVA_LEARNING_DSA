package PATTERNS;
import java.util.*;

public class patternHW1 {
    public static void main(String abs[]) {
        int n = 5;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
         for (i = n; i >=1; i--) {
            for (j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}