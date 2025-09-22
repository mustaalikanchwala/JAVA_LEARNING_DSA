// Remove Element
// Enter Size of Array: 6  
// Enter Array Elements: 3 2 2 3 4 5  
// Enter value: 3

// | i | nums\[i] | nums\[i] != 3? | Action            | nums (after)        | j |
// | - | -------- | -------------- | ----------------- | ------------------- | - |
// | 0 | 3        | ❌              | Skip              | \[3, 2, 2, 3, 4, 5] | 0 |
// | 1 | 2        | ✅              | nums\[0] = 2, j++ | \[2, 2, 2, 3, 4, 5] | 1 |
// | 2 | 2        | ✅              | nums\[1] = 2, j++ | \[2, 2, 2, 3, 4, 5] | 2 |
// | 3 | 3        | ❌              | Skip              | \[2, 2, 2, 3, 4, 5] | 2 |
// | 4 | 4        | ✅              | nums\[2] = 4, j++ | \[2, 2, 4, 3, 4, 5] | 3 |
// | 5 | 5        | ✅              | nums\[3] = 5, j++ | \[2, 2, 4, 5, 4, 5] | 4 |


import java.util.*;
public class Solution_03 {
    public static int removeElement(int[] nums, int val) {
        int j =0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
       
        return j;
    }
    public static void main(String abs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter value : ");
        int val = sc.nextInt();
        int k = removeElement(nums,val);
        System.out.println("After removing val the no.of elements left : "+k);
        System.out.println("The update array is : ");
        System.out.println(Arrays.toString(nums));
    }
}
