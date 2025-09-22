import java.util.*;
import java.util.Scanner;
public class Sol_16_20 {
    // Bubble Sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order. It's called "bubble" sort because larger elements gradually "bubble up" to the end of the list.
//     Example:
// Given array: [5, 2, 9, 1]

// Pass 1:

// Compare 5 & 2 → Swap → [2, 5, 9, 1]

// Compare 5 & 9 → No Swap

// Compare 9 & 1 → Swap → [2, 5, 1, 9]

// Pass 2:

// Compare 2 & 5 → No Swap

// Compare 5 & 1 → Swap → [2, 1, 5, 9]

// 9 is already in place

// Pass 3:

// Compare 2 & 1 → Swap → [1, 2, 5, 9]

// Now the array is sorted.

// public static int[] SortArray(int[] arr){
//     for(int i = 0;i<arr.length-1;i++){
//         for(int j = i+1;j<arr.length;j++){
//             if(arr[i]>arr[j]){
//                 int temp = arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
//             }
//         }
//     }
//     return arr;
// }
// public static void main(String s[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter size of Array");
//     int size = sc.nextInt();
//     int arr[] = new int[size];
//     System.out.println("ENter arr elemnts");
//     for(int i = 0;i<size;i++){
//         arr[i]= sc.nextInt();
//     }
//     System.out.println(Arrays.toString(SortArray(arr)));
// }

    // Insertion Sort Q_17

    public static void main(String[] args) {
        int InsertionSort[] = {4,3,5,1};
        for(int i = 1;i<InsertionSort.length;i++){
            int unsorted = InsertionSort[i];
            int sort = i-1;
            while (sort>=0 && unsorted<InsertionSort[sort]){
                InsertionSort[sort+1] = InsertionSort[sort];
                sort--;
            }
            InsertionSort[sort+1] = unsorted;
        }
        System.out.println(Arrays.toString(InsertionSort));
    }

    // Selection Sort Q_18



}
