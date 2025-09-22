// plusOne

// digits = [8, 9, 9, 9]
// | Step | `i` | `digits[i]` | Condition `digits[i] < 9` | Action                   | Updated `digits`  |
// | ---- | --- | ----------- | ------------------------- | ------------------------ | ----------------- |
// | 1    | 3   | 9           | false                     | `digits[3] = 0`          | \[8, 9, 9, **0**] |
// | 2    | 2   | 9           | false                     | `digits[2] = 0`          | \[8, 9, **0**, 0] |
// | 3    | 1   | 9           | false                     | `digits[1] = 0`          | \[8, **0**, 0, 0] |
// | 4    | 0   | 8           | true                      | `digits[0]++` and return | \[**9**, 0, 0, 0] |


package ARRAYS;

public class Solution_06 {
  public int[] plusOne(int[] digits) {
       for(int i = digits.length - 1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
       }
    int arr[] = new int[digits.length+1];
    arr[0]=1;
    return arr;
    }
}
