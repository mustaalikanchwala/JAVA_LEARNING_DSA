// Search Insert
// Enter Array size: 5  
// Enter Array elements: 1 3 5 6 9  
// Enter target: 7
// ➤ Loop 1: Checking if target exists
// | i | nums\[i] | nums\[i] == target? |
// | - | -------- | ------------------- |
// | 0 | 1        | ❌                   |
// | 1 | 3        | ❌                   |
// | 2 | 5        | ❌                   |
// | 3 | 6        | ❌                   |
// | 4 | 9        | ❌                   |
// Target 7 is not present, so we move to the second loop.

// ➤ Loop 2: Finding insert position
// | j | nums\[j] | target < nums\[j]? |
// | - | -------- | ------------------ |
// | 0 | 1        | ❌                  |
// | 1 | 3        | ❌                  |
// | 2 | 5        | ❌                  |
// | 3 | 6        | ❌                  |
// | 4 | 9        | ✅ → return 4       |



import java.util.*;
public class Solution_04 {
    public static int searchInsert(int[] nums, int target) {
       
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        int j;
        for(j = 0;j<nums.length;j++){
            if(target<nums[j]){
                return j;
            }
        }
        return nums.length;
    } 
        
    public static void main(String abs[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Array size : ");
      int size = sc.nextInt();
      int nums[] = new int[size];
      System.out.println("Enter Array elements : ");
      for(int i = 0;i<size;i++){
       nums[i] = sc.nextInt();
      }
      System.out.println("Enter target :");
      int target = sc.nextInt();
      System.out.println("Target found at index : "+searchInsert(nums,target));
    }
}
