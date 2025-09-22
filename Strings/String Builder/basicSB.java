import java.util.*;
public class basicSB {
    public static void main(String a[]){
        // Declaring String Builder
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // using CharAt()
        System.out.println(sb.charAt(2));

        // set chat at index 0 ,can replace char
        sb.setCharAt(0,'S'); // it will replace char at index 0 with S. char should replace at which index.
        System.out.println(sb);

        // insert() it will insert a new char by shifting existing elements
        sb.insert(0,'T');
        System.out.println(sb);
        sb.insert(2,'n');
        System.out.println(sb);
        sb.insert(6,'h');  // its add h in last of tony
        System.out.println(sb);

        // Delete the part from string
        // sb.delete(2, 3); // here it will go till 3-1 means 2,2 that means ending is index-1 ;
        // System.out.println(sb);
        // sb.delete(1, 2); // => 1,1
        // System.out.println(sb);
        // deleting both char at once
        sb.delete(1, 3);
        System.out.println(sb);

        // append the char 
        StringBuilder hello = new StringBuilder("h");
        hello.append('e'); // in normal string str =str+'e'; in each char a new string form.
        hello.append('l'); // StringBuilder is efficient 
        hello.append('l');
        hello.append('o');
        System.out.println(hello);
        // to print legth
        System.out.println(hello.length());
    }
}
