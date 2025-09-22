package ARRAYS;
import java.util.*;
public class HAvgNum {
    public static void main(String abs []){
        System.out.println("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
         for (int i = 0; i < n; i++) {
            sum = sum+array[i];
         } int count = 0;
         int  result = sum/n;
          for (int i = 0; i < n; i++) {
            if (  result < array[i]){
                count++;
            }
          }
          System.out.println(" The numbers higher than the average of an array : "+count);

    }
}
