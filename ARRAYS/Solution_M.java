// Median of tow sorted array

import java.util.*;
public class Solution {
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge[] = new int[nums1.length+nums1.length];
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge,nums1.length, nums2.length);
        int median = 0;
        for(int i = 0; i<(nums1.length+nums2.length)-1;i++){
          median = median
        }
    }
}
