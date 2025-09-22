import java.util.*;
public class HW_01 {
    public static void main(String s[]){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter a number to check if number is power of 2 or not : ");
   int n = sc.nextInt();
   int BitMask;
//    Method 1
//    int count = 0;
//    for(int i = 0;i<32;i++){
//     BitMask = 1<<i;
//     if((BitMask & n)!=0) count++;
//    }
//    if(count==1){ System.out.println("The number is power of 2");
// }else{
//     System.out.println("The number is not power of 2");
// }
//  Method 2
 
     if(n>0 && ((n & (n-1))==0)){
        System.out.println("Number is power of two");
     }else{
        System.out.println("Not a power of 2");
     }
//      🔍 How it works:
// This logic is based on the fact that:

// A number n is a power of 2 if and only if it has only one set bit in binary.

// And for such numbers:

// n & (n - 1) will always be 0

// n      = 8  →  1000 (binary)
// n - 1  = 7  →  0111 (binary)

// 1000 & 0111 = 0000

    }
}
