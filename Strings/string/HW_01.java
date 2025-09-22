package Strings.string;
// This Java program calculates the total number of characters from all the strings entered by the user into a string array.
// Enter size of String array: 3
// Enter Strings:
// Hello
// Java
// World

// | Step | i | arr\[i] | arr\[i].length() | totallength |
// | ---- | - | ------- | ---------------- | ----------- |
// | -    | - | -       | -                | 0           |
// | 1    | 0 | Hello   | 5                | 5           |
// | 2    | 1 | Java    | 4                | 9           |
// | 3    | 2 | World   | 5                | 14          |


import java.util.*;
public class HW_01 {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of String array : ");
         int size = sc.nextInt();
         String arr[] = new String[size];
         int totallength = 0;
         System.out.println("Enter Strings : ");
         sc.nextLine();
         for(int i = 0; i<size;i++){
            arr[i]=sc.nextLine();
           totallength += arr[i].length();
         }
         System.out.println("Total length is : "+totallength);
    }
}
