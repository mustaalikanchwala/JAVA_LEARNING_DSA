// arr = [7, 3, 5, 2]
// | Pass | i | Initial Array | Compared Elements | Smallest Element     | Swap         | Array After Swap |
// | ---- | - | ------------- | ----------------- | -------------------- | ------------ | ---------------- |
// | 1    | 0 | \[7, 3, 5, 2] | 7 vs 3, 5, 2      | 2 (index 3)          | Swap 7 and 2 | \[2, 3, 5, 7]    |
// | 2    | 1 | \[2, 3, 5, 7] | 3 vs 5, 7         | 3 (already smallest) | No swap      | \[2, 3, 5, 7]    |
// | 3    | 2 | \[2, 3, 5, 7] | 5 vs 7            | 5 (already smallest) | No swap      | \[2, 3, 5, 7]    |
// [2, 3, 5, 7]

package Sorting;

// Time Complexcity : O(n^2)
import java.util.*;

public class SelectionSort {

  public static void main(String s[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter array to Selection sort");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[smallest] > arr[j]) {
          smallest = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = temp;
    }
    System.out.println("ASC: " + Arrays.toString(arr));

    for (int i = 0; i < arr.length - 1; i++) {
      int largest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[largest] < arr[j]) {
          largest = j;
        }

      }
      int temp = arr[largest];
      arr[largest] = arr[i];
      arr[i] = temp;
    }
    System.out.println("DESC: " + Arrays.toString(arr));
  }
}
