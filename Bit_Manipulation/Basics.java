// // A & B = 0001 → (bitwise AND)

// A | B = 0111 → (bitwise OR)

// A ^ B = 0110 → (bitwise XOR)

// ~A = 1010 → (bitwise NOT of A)
// bit position to toggle, 0-indexed from the right
import java.util.*;
public class Basics {
    public static void main(String s[]){
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
       int n = sc.nextInt(); // this will perform operation with bitMask number.
       System.out.println("Enter position to Shift : ");
       int pos = sc.nextInt(); // postion to shift number 1 .
       int bitMask = 1<<pos; // this createa a bit mask which is a number which will always one ,because we are shifting 1 only.
       
        //   GET operation
        // (AND &) operation performed
    //    if((bitMask & n)==0) { // in bit manipulation the logical operttors are
    //      System.out.println("Bit was zero");
    //    }else{System.out.println("Bit was one");}
    // }

    // SET Operation 
    // (OR |) operation performed
    // it will set 1 in place of zero.
    //  int newNumber = bitMask | n ;  
    // System.out.println(newNumber);

    // Clear 
    //  it will clear  the 1 and make it zero 0;
    //   And With Not operation 
    // In this, first we will create bit mask then turn it into Not(Eg:0100->1011),then performed with And.
   int newNumber = ~bitMask & n;
    System.out.println(newNumber);



}
}