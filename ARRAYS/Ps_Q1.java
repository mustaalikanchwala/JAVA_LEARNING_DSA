package ARRAYS;
import java.util.*;

public class Ps_Q1 {
    public static void main(String a[]) {
        System.out.println("Enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter number to Search");
        int x = sc.nextInt();
        for (int i = 0; i < size; i++) { // array.length=>size of array
            if (array[i] == x) {
                System.out.println(array[i] + " is found at " + i);
            }
        }

    }
}
