//  SubArrays of Array
// n = 3  
// array = [1, 2, 3]

// | `i` | `j` | `k` values (from i to j) | Subarray printed |
// | --- | --- | ------------------------ | ---------------- |
// | 0   | 0   | 0                        | 1                |
// | 0   | 1   | 0, 1                     | 1 2              |
// | 0   | 2   | 0, 1, 2                  | 1 2 3            |
// | 1   | 1   | 1                        | 2                |
// | 1   | 2   | 1, 2                     | 2 3              |
// | 2   | 2   | 2                        | 3                |

package ARRAYS;
import java.util.*;

public class Solution_07 {
    public static void main(String abs[]){
     System.out.println("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    for(int  i = 0; i<n;i++){
        for(int j = i;j<n;j++){
            for(int k = i;k<=j;k++){
                System.out.print(array[k]+" ");
            }
            System.out.println();
        }
    }
    }
}
