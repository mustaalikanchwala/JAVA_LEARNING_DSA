// Find Second Smallest and Largest element
public class Solution_10 {
    public int secondSmallestElement(int[] nums) {
int small=Integer.MAX_VALUE;
int second_small=Integer.MAX_VALUE;
// int large=Integer.MIN_VALUE;
// int second_large=Integer.MIN_VALUE;
for(int i : nums){
    if(i<small){
    small = i;
        }else if(i<second_small && i!=small){
            second_small = i;
        }

    }
    return second_small == Integer.MIN_VALUE ? -1 : second_small;
}

public int secondLargestElement(int nums[]){
    int large = Integer.MIN_VALUE;
    int second_large = Integer.MIN_VALUE;
    for(int i : nums){
        if(i>large){
            large = i;
        }else if(i>second_large && i!=large){
            second_large = i;
        }
    }
    return second_large == Integer.MIN_VALUE ? -1 : second_large;

}
}

