// A = "aabbccd", B = 2

// | Step | `i` | Group (A\[i] to A\[j-1]) | Character | Count (`j - i`) | Action               | Result So Far |
// | ---- | --- | ------------------------ | --------- | --------------- | -------------------- | ------------- |
// | 1    | 0   | "aa"                     | a         | 2               | Removed (count == B) | ""            |
// | 2    | 2   | "bb"                     | b         | 2               | Removed (count == B) | ""            |
// | 3    | 4   | "cc"                     | c         | 2               | Removed (count == B) | ""            |
// | 4    | 6   | "d"                      | d         | 1               | Kept (count ≠ B)     | "d"           |

import java.util.*;
public class removeConsecutiveChar{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter B");
        int B = sc.nextInt(); 
        System.out.println("Enter a string");
        String A = sc.next();
        StringBuilder sb = new StringBuilder();
        int n = A.length();
        int i = 0;
        int j = 0;
        while (i<n) {
            char currentChar = A.charAt(i);
            j=i;
            while (j<n && A.charAt(j)==currentChar) {
                j++;
            }
            int count = j-i;
            if(count!=B){
                for(int k = 0;k<count;k++){
                sb.append(currentChar);
                }
            }
            i=j;

        }
        System.out.println(sb);

    }
}