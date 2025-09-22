import java.util.*;
public class HW_02 {
public static void main(String[] s){
  Scanner sc = new Scanner(System.in);
  System.out.println("ENter n to toggle ");
  int n = sc.nextInt();
  System.out.println("Enter pos ");
  int pos = sc.nextInt();
  int BitMask = 1<<pos;
  int newNumber = BitMask ^ n;
  System.out.println(newNumber);
}
    
}
// ✅ What It Does:
// Takes input n (the number).

// Takes input pos (bit position to toggle, 0-indexed from the right).

// Creates a bitmask 1 << pos which has 1 only at position pos.

// Performs XOR (^) between n and the bitmask.

// This flips the bit at pos (toggle).

// Prints the new number.