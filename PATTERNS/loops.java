package PATTERNS;
import java.util.*;

public class loops {
   public static void main(String abs[]) {
      System.out.println("Enter your choice(1-2)");
      Scanner sc = new Scanner(System.in);
      int ch = sc.nextInt();
      switch (ch) {
         case 1:
            do {
               System.out.println("enter your marks");
               int marks = sc.nextInt();
               if (marks >= 90 & marks <= 100) {
                  System.out.println("This is Good");
               } else if (marks <= 89 & marks >= 60) {
                  System.out.println("This is also Good");
               } else if (marks <= 59 & marks > 0) {
                  System.out.println("This is Good as well");
                  System.out.println("Because marks don’t matter but our effort does.");
               } else {
                  System.out.println("plz enter valid marks");
               }
               System.out.println("do you want to enter more marks ");
               ch = sc.nextInt();
            } while (ch == 1);
            System.out.println("Exiting the progarm......");
            break;
         case 2:
            System.out.println("Exiting the progarm......");
            break;
         default:
            System.out.println("Invalid choice, plz enter 1-2 only");
      }
   }
}
