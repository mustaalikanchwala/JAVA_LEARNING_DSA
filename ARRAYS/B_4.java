package ARRAYS;
import java.util.*;

public class B_4 {
    public static void main(String a[]) {
        System.out.println("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            if (visited[i]) continue;
            int dup = 0;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true;
                    dup = 1;
                }
            }
            if (dup == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
