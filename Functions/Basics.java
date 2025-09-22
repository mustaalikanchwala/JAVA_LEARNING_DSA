package Functions;

import java.util.*;
public class Basics {
    public static void PrintMyName(String name){  // Function Dehination and declaration
        System.out.println(name);
        return;
    }
    public static void main(String abs[]){
         Scanner sc = new Scanner(System.in);
         String name = sc.next();
         PrintMyName(name); // Function call
    }
    
}
