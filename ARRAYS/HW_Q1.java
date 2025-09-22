package ARRAYS;
import java.util.*;

public class HW_Q1 {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();// .nextInt left a line after pressing enter which is consumed by the .nextline(in for loop) thats why first name is skipped because leftover line consumed by the .nextline(in for loop).
        // To solve this we can use sc.nextline this consume the leftover line.
        sc.nextLine();
        String names[] = new String[n];
        System.out.println("Enter names : ");
        // Inputs names
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        // Showing names
        for (int i = 0; i < n; i++) {
            System.out.println("Name " +(1+i)+" is "+ names[i]);
        }
    }

}
