// Remove Duplicates
// The array is sorted in non-decreasing order, so all duplicates will appear next to each other
// Example for revision
// Step	j	nums[j]	i	    nums[i]	           Action	     Array After
// 1	1	0	    0	       0	      same → skip	[0,0,1,1,2,3,3]
// 2	2	1	    0	       0	      new → i++, copy	[0,1,1,1,2,3,3]
// 3	3	1	    1	       1	      same → skip	(same)
// 4	4	2	    1	       1	      new → i++, copy	[0,1,2,1,2,3,3]
// 5	5	3	    2	       2	      new → i++, copy	[0,1,2,3,2,3,3]
// 6	6	3	    3	       3	      same → skip	(same)

// import java.util.*;
// public class Solution{
//    public static int removeDuplicates(int[] nums) {
//     int i=0 ;
//         for(int j=1;j<nums.length;j++){
//             if(nums[j]!=nums[i]){
//                 i++;
//                 nums[i]=nums[j];
//             }
//         }
//         return i+1;
//     }
//     public static void main(String abs[]){
//         int nums[] = {0,0,1,1,1,2,2,3,3,4};
//         int k = removeDuplicates(nums);
//         System.out.println("The no. of  unique elements is : "+k);
//         System.out.println("Updated array is : ");
//         for(int i = 0;i<k;i++){
//             System.out.println(nums[i]);
//         }
//     }
// }
import java.util.*;

public class Solution_02 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] < nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String abs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println("The no. of  unique elements is : " + k);
        System.out.println("Updated array is : ");
        System.out.print(Arrays.toString(nums));

    }

}
