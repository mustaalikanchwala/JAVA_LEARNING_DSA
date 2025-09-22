package ARRAYS;

import java.util.*;

public class HW_Q2 {
    public static void main(String a[]) {
        System.out.println("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // Method 1
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);

    }
}