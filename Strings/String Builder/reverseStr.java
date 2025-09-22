// input = "abcd"
// | Iteration | `i` (revStr index) | `j` (OrgStr index) | `OrgStr.charAt(j)` | Before `revStr` | After `revStr.setCharAt(i, OrgStr.charAt(j))` |
// | --------- | ------------------ | ------------------ | ------------------ | --------------- | --------------------------------------------- |
// | 1         | 3                  | 0                  | 'a'                | "abcd"          | "abca"                                        |
// | 2         | 2                  | 1                  | 'b'                | "abca"          | "abba"                                        |
// | 3         | 1                  | 2                  | 'c'                | "abba"          | "acba"                                        |
// | 4         | 0                  | 3                  | 'd'                | "acba"          | "dcba"                                        |

import java.util.*;
public class reverseStr {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder OrgStr = new StringBuilder(input);
        StringBuilder revStr = new StringBuilder(input);
        int j =0;
        for(int i =(OrgStr.length()-1);i>=0;i--){
            revStr.setCharAt(i,OrgStr.charAt(j));
            j++;
        }
        System.out.println(revStr);
    }
}
