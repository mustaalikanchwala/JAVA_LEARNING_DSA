package PATTERNS;
import java.util.*;

public class pattern12 {
    public static void main(String abs[]) {
        int n = 5;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            int space = (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");

            }
            c++;
            System.out.println();
        }
    }
}
