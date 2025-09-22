// arr = [7, 3, 5, 2]
// | Pass | i | Comparisons         | Swaps Made    | Array After Pass |
// | ---- | - | ------------------- | ------------- | ---------------- |
// | 1    | 0 | 7>3 ✔, 7>5 ✔, 7>2 ✔ | 7↔3, 7↔5, 7↔2 | \[3, 5, 2, 7]    |
// | 2    | 1 | 3>5 ❌, 5>2 ✔        | 5↔2           | \[3, 2, 5, 7]    |
// | 3    | 2 | 3>2 ✔               | 3↔2           | \[2, 3, 5, 7]    |
// ASC : [2, 3, 5, 7]
package Sorting;
import java.util.*;
public class BubbleSort{
  
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter array to bubble sort");
        for(int i = 0;i<size;i++){
         arr[i]=sc.nextInt();
        }
        // Time Complexcity : O(n^2)
//                 ASC
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1]=temp;
                }
            }
        }
            System.out.print("ASC : "+Arrays.toString(arr));
            System.out.println();
//               DESC
            for(int i = 0;i<arr.length-1;i++){
               for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
               }
            }
            System.out.print("DESC : "+Arrays.toString(arr));  

    }
}