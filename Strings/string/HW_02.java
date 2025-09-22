package Strings.string;
// This program replaces every 'e' in the input string with 'i' and builds a new result string.
// | i | `first.charAt(i)` | Condition (`== 'e'`) | Action Taken | `result`   |
// | - | ----------------- | -------------------- | ------------ | ---------- |
// | 0 | `e`               | ✅ true               | add `'i'`    | `i`        |
// | 1 | `l`               | ❌ false              | add `'l'`    | `il`       |
// | 2 | `e`               | ✅ true               | add `'i'`    | `ili`      |
// | 3 | `p`               | ❌ false              | add `'p'`    | `ilip`     |
// | 4 | `h`               | ❌ false              | add `'h'`    | `iliph`    |
// | 5 | `a`               | ❌ false              | add `'a'`    | `ilipha`   |
// | 6 | `n`               | ❌ false              | add `'n'`    | `iliphan`  |
// | 7 | `t`               | ❌ false              | add `'t'`    | `iliphant` |

import java.util.*;
public class HW_02 {
    public static void main(String a[]){
     Scanner sc = new Scanner(System.in);
     String first = sc.nextLine();
     String result = "";
     for(int i = 0;i<first.length();i++){
        if(first.charAt(i)=='e'){ // here e and i is char therefore it is come in ''.
        // it checks if at given index if char is e it will replce by i.
            result += 'i'; // it will replace e 
        }else{
          result+=first.charAt(i);  // if it is not e then other all char will add in result
        }
     }
     System.out.println(result);
    }
}
