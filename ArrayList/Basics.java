package ArrayList;

import java.util.*;
public class Basics {
    public static void main(String []s){
        Scanner sc = new Scanner(System.in);
        // Syntax of Array List
        ArrayList<Integer> list = new ArrayList<>();
        // Add 
        list.add(10);
        list.add(30);
        list.add(20);
        // it will add element directly at the end.
        //  to print we dont need to itrate
        System.out.println(list); 
        //    Add at any Index
        list.add(1,40);
        System.out.println(list); 
        // GET
        System.out.println(list.get(1)); // it will give element at index 1. output 40.
        //  SET 
        // it will change element at give index eg: index 2 => 30 after 2=>60
        list.set(2,60);
        System.out.println(list);
        // remove
         list.remove(2); // remove 60
         System.out.println(list); 
        //  in such case you have option to remove elements from both end then prefer to remove from end.
         // by removing from front or at any index it shift elemnts which is expensive
        //  size
        System.out.println(list.size()); // it will give size of arraylist
    }
}
