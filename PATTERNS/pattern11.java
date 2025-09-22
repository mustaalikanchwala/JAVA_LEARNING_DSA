package PATTERNS;
import java.util.*;

public class pattern11 {
    public static void main(String abs[]) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            // for space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            // for(int j = 1;j<i;j++){
            // System.out.print(" ");} not needed this loop

            System.out.println();
        }
    }
}
