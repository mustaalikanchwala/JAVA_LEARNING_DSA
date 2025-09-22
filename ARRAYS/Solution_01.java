//  Two Sum
// Enter the size of Array: 5
// Enter the elements of Array: 2 7 11 15 3
// Enter target: 10

// | i | j | arr\[i] | arr\[j] | arr\[i] + arr\[j] | Equals Target? | Action          |
// | - | - | ------- | ------- | ----------------- | -------------- | --------------- |
// | 0 | 1 | 2       | 7       | 9                 | ❌              | continue        |
// | 0 | 2 | 2       | 11      | 13                | ❌              | continue        |
// | 0 | 3 | 2       | 15      | 17                | ❌              | continue        |
// | 0 | 4 | 2       | 3       | 5                 | ❌              | continue        |
// | 1 | 2 | 7       | 11      | 18                | ❌              | continue        |
// | 1 | 3 | 7       | 15      | 22                | ❌              | continue        |
// | 1 | 4 | 7       | 3       | **10**            | ✅              | `return [1, 4]` |

import java.util.*;
public class Solution_01 {
    public static int[] twoSum(int[] arr,int target){ 
        for (int i = 0; i < arr.length - 1; i++) {
           for (int j = i + 1; j < arr.length ; j++) {
                    if ((arr[i] + arr[j]) == target) {
                        return new int[]{ i,j};
                    }
                }
            }
            return new int[]{};
        }
        
        public static void main(String ab[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ths size of Array  : ");
        int n = sc.nextInt();
        System.out.println("Enter ths elements  of Array  : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target : ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr,target )));

    }
}
