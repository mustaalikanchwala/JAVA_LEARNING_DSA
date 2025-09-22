package Strings.string;
// Enter email:
// mustaali123@gmail.com

// | Step | `i` | `email.charAt(i)` | Condition (`== '@'`) | `k` (index of '@') | `username`      |
// | ---- | --- | ----------------- | -------------------- | ------------------ | --------------- |
// | 1    | 0   | `m`               | No                   | -                  | ""              |
// | 2    | 1   | `u`               | No                   | -                  | ""              |
// | 3    | 2   | `s`               | No                   | -                  | ""              |
// | 4    | 3   | `t`               | No                   | -                  | ""              |
// | 5    | 4   | `a`               | No                   | -                  | ""              |
// | 6    | 5   | `a`               | No                   | -                  | ""              |
// | 7    | 6   | `l`               | No                   | -                  | ""              |
// | 8    | 7   | `i`               | No                   | -                  | ""              |
// | 9    | 8   | `1`               | No                   | -                  | ""              |
// | 10   | 9   | `2`               | No                   | -                  | ""              |
// | 11   | 10  | `3`               | No                   | -                  | ""              |
// | 12   | 11  | `@`               | ✅ Yes                | 11                 | `"mustaali123"` |
// | 13   | 12+ | (remaining)       | Not checked          | -                  | `"mustaali123"` |


import java.util.*;
public class HW_03 {
    public static void main(String a []){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter email");
        String email = sc.nextLine();
        String username = "";
        int k;
        for(int i = 0;i<email.length();i++){
            if('@' == email.charAt(i)){
                k=(i);
                username = email.substring(0,k);
            }
        }
        System.out.println("Username: "+username);
    }
}
