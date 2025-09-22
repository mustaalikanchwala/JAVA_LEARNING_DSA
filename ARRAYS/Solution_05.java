// Merge Sorted Array
// Time complexctiy is not good ,need to improve.

// nums1 = [1, 3, 5, 0, 0, 0]   // m = 3
// nums2 = [2, 4, 6]            // n = 3

// 🔁 Step 1: Copy nums2 into nums1 starting from index m

// | i | j | nums1 (after copy)    |
// | - | - | --------------------- |
// | 3 | 0 | \[1, 3, 5, 2, 0, 0]   |
// | 4 | 1 | \[1, 3, 5, 2, 4, 0]   |
// | 5 | 2 | \[1, 3, 5, 2, 4, 6] ✅ |

// 🔁 Step 2: Sort the entire nums1 (size = m + n = 6)

// | Pass | i | k comparisons     | Swaps done    | nums1 after pass                |
// | ---- | - | ----------------- | ------------- | ------------------------------- |
// | 1    | 0 | 1→5: \[3,5,2,4,6] | 1↔3 (1 > 2) ✅ | \[1,3,5,2,4,6] → \[1,3,5,2,4,6] |
// | 2    | 1 | 2→5: \[5,2,4,6]   | 3↔1 (3 > 2) ✅ | \[1,2,5,3,4,6]                  |
// | 3    | 2 | 3→5: \[3,4,6]     | 3↔2 (5 > 3) ✅ | \[1,2,3,5,4,6]                  |
// | 4    | 3 | 4→5: \[4,6]       | 4↔3 (5 > 4) ✅ | \[1,2,3,4,5,6] ✅                |
// | 5    | 4 | 5: \[6]           | No swap       | Final sorted array              |



import java.util.*;
public class Solution_05 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        
       for(int i = m;i<(m+n);i++){
            nums1[i]=nums2[j];
            j++;
        }
       for(int i = 0; i<(n+m-1);i++){
        for(int k=i+1;k<(n+m);k++ ){
            if(nums1[i]>nums1[k]){
                int temp = nums1[k];
                nums1[k]=nums1[i];
                nums1[i]=temp;
            }
        }
       }
           System.out.println(Arrays.toString(nums1));
    }
    }

