package ARRAYS;
import java.util.*;
public class baics{
    public static void main(String abs[]){  // String abs[]=> this is also a array which store string
        // How to create array
    //  int[] marks = new int[3];    // new is a keyword use to get space in memary;
    //  int marks[] = new int[3]; // this is also right way to write
    //  How to insert value in array manually
    //  marks[0]=99;
    //  marks[1]=98;
    //  marks[2]=88;
    //  Printing manualy
    //  System.out.println(marks[0]);
    //  System.out.println(marks[1]);
    //  System.out.println(marks[2]);
    // Shortcut way to define array
    // int marks[]= {98,97,99};
    //  Printing array by using for loop
    // for(int i = 0;i<3;i++){
    //     System.out.println(marks[i]);
    // }
    // taking input for array
    // for size
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of array : ");
    int size = sc.nextInt();
    int marks[]=new int[size];
    // for elements
    System.out.println("Enter Elements : ");
    for(int i = 0;i<size;i++){
        marks[i] = sc.nextInt();
    }
//  for showing otput
    for(int i = 0;i<size;i++){
        System.out.println(marks[i]);
     }
   
    }
}