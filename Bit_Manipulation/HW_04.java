//  Example 1: Decimal to Binary
// Input: n = 13
// Function: decimaltobinary(13)
// | Step | `n` (input) | `n % 2` | `str` (Binary So Far) | `n = n / 2` |
// | ---- | ----------- | ------- | --------------------- | ----------- |
// | 1    | 13          | 1       | "1"                   | 6           |
// | 2    | 6           | 0       | "01"                  | 3           |
// | 3    | 3           | 1       | "101"                 | 1           |
// | 4    | 1           | 1       | "1101"                | 0           |
// Final Binary String: "1101"
// Return Value (as int): 1101

// Example 2: Binary to Decimal
// Input: "1101"
// Function: binarytodecimal("1101")
// | Step | `i` (index) | `c` (char) | `bit` (int) | `pow` | `bit * 2^pow` | `sum` |
// | ---- | ----------- | ---------- | ----------- | ----- | ------------- | ----- |
// | 1    | 3           | '1'        | 1           | 0     | 1 × 2⁰ = 1    | 1     |
// | 2    | 2           | '0'        | 0           | 1     | 0 × 2¹ = 0    | 1     |
// | 3    | 1           | '1'        | 1           | 2     | 1 × 2² = 4    | 5     |
// | 4    | 0           | '1'        | 1           | 3     | 1 × 2³ = 8    | 13    |
// Final Decimal: 13
import java.util.Scanner;

public class HW_04 {
   public static int decimaltobinary(int n){
    String str = "";
    while(n>0){
   str = n%2 +str;
  //  in my logic binary are in reverse str+=n%2;
   n=n/2;
    }
    return Integer.parseInt(str);
   }  
   public static int binarytodecimal(String bi){
    int pow=0; // it represent the index of binary
    int sum = 0;
    for(int i = bi.length()-1;i>=0;i--){
    char c = bi.charAt(i);
    if(c=='1' || c=='0'){
      int bit = c-'0'; // convert char to int
      sum+=bit*Math.pow(2, pow);
      pow++;
    }else{
      System.out.println("Wrong binary numm");
      return -1;
    }
    }
    return sum;
   }
public static void main(String[] s ){
  Scanner sc = new Scanner(System.in);
  System.out.println("Chosse a choice ");
  System.out.println("A for Decimal to Binary");
  System.out.println("B for Binary TO Decimal");
  String ch = sc.next();
  switch (ch) {
    case "A":
    System.out.println("Enter a decimal value");
      int n = sc.nextInt();
     System.out.println( decimaltobinary(n));
      break;
    case "B":
    System.out.println("ENter a Binary value");
    String bi = sc.next();
    System.out.println( binarytodecimal(bi));
    break;
    default:
System.out.println("Invalid choice");
      break;
  }
}

}
