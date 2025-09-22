package ARRAYS;
// nums = [1, 2, 4, 5, 7, 8, 10]
//   Step 1: Find Maximum (n)
// | Index `i` | `nums[i]` | Current `n` | Condition `nums[i] > n` | Updated `n` |
// | --------- | --------- | ----------- | ----------------------- | ----------- |
// | 0         | 1         | 7           | ❌                       | 7           |
// | 1         | 2         | 7           | ❌                       | 7           |
// | 2         | 4         | 7           | ❌                       | 7           |
// | 3         | 5         | 7           | ❌                       | 7           |
// | 4         | 7         | 7           | ❌                       | 7           |
// | 5         | 8         | 7           | ✅                       | 8           |
// | 6         | 10        | 8           | ✅                       | 10          |

// Step 2: Mark present[nums[i]] = true

// | Index `i` | `nums[i]` | Condition `1 <= nums[i] <= n` | `present[nums[i]]` marked as `true` |
// | --------- | --------- | ----------------------------- | ----------------------------------- |
// | 0         | 1         | ✅                             | present\[1] = true                  |
// | 1         | 2         | ✅                             | present\[2] = true                  |
// | 2         | 4         | ✅                             | present\[4] = true                  |
// | 3         | 5         | ✅                             | present\[5] = true                  |
// | 4         | 7         | ✅                             | present\[7] = true                  |
// | 5         | 8         | ✅                             | present\[8] = true                  |
// | 6         | 10        | ✅                             | present\[10] = true                 |

//  Step 3: Loop from 1 to n and collect missing numbers

//  | `i` from 1 to 10 | `present[i]` | Is Missing? → `!present[i]` | Action          |
// | ---------------- | ------------ | --------------------------- | --------------- |
// | 1                | true         | ❌ No                        | Skip            |
// | 2                | true         | ❌ No                        | Skip            |
// | 3                | false        | ✅ Yes                       | Add 3 to result |
// | 4                | true         | ❌ No                        | Skip            |
// | 5                | true         | ❌ No                        | Skip            |
// | 6                | false        | ✅ Yes                       | Add 6 to result |
// | 7                | true         | ❌ No                        | Skip            |
// | 8                | true         | ❌ No                        | Skip            |
// | 9                | false        | ✅ Yes                       | Add 9 to result |
// | 10               | true         | ❌ No                        | Skip            |

// Final Result Array:

// | Index `j` | Value (Missing Number) |
// | --------- | ---------------------- |
// | 0         | 3                      |
// | 1         | 6                      |
// | 2         | 9                      |


import java.util.*;
public class B_5 {
    public static int[] missingnums(int[] nums){
        int n = nums.length;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]>n){
                n=nums[i];
            }
        }
        boolean[] present = new boolean[n+1];  // it is used to mark that number is present or not betwwen 1 to n;
        // this for loop marks the present nums
        for(int i = 0; i<nums.length;i++){ // here i is used for index pf nums 
       if(nums[i]>=1 && nums[i]<=n){  // nums betwween 1 to n
        present[nums[i]] = true;  // if nums id present it marsk ha spresent.
        // Now when the loop runs:

        // nums[0] = 4 → present[4] = true (means number 4 is present)

        // nums[1] = 2 → present[2] = true (means number 2 is present)

        // nums[2] = 1 → present[1] = true (means number 1 is present)
       }
        }
        int j = 0;
        int arr[] = new int[n];
        for(int i = 1; i<n;i++){ // here i is used for elements of nums
            if(!present[i]){ // it checks if number is mark present true then condition become false and if marks false then condition become true.
             arr[j]=i;  //  the which is not present is store in arr.
             j++;
            }
        }
         // Return only the filled part of the result
        return Arrays.copyOf(arr, j);
    }
    public static void main(String a []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int nums[]= new int[size];
        for(int i =0; i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(missingnums(nums)));
    }
}
