package Strings.string;
import java.util.*;
 public class Basics{
    public static void main(String a[]){
        // String is class 
        // actual syntax is
        String name3 = new String("This is actual syntax");
        String firstName = "Mustaali";
        String LastName = "Kanchwala";
        Scanner sc = new Scanner(System.in);
        // String fullname = sc.nextLine();
        // System.out.println("Full name is : "+fullname);
        // concatenation

        String first = "Tony";
        String sec = "Stark";
        String full = first + " "+ sec;
        // System.out.println(full.length()); // it will print the length of String

        // to print a char from string we use CharAt()
        
        for(int i = 0;i<full.length();i++){
            // System.out.println(full.charAt(i));
        }

        // To Compare Two String we use compareTo()

        // it check three case
        // 1. s1>s2 => +ve value
        // 2. s1==s2 => 0
        // 3. s1<s2 => -ve value
        // it compare the char of string (eg a<b) so string which have b is bigger
        // if((first.compareTo(sec))==0){  // first == sec dont use can fail in some test cases
            // System.out.println("Strings are equal");
        // }else{System.out.println("String are not equal");}

        // subsString
        // it gives a sub string from a main string 
        // it takes a beginning index from where you want string to start
        // and a end index  to where you want to end
        // if beg i is 0 and end is 4 then string will come 0 to 3 4 will not include 
        String sen = "Hi My name is Mustaali";
        String nameSen = sen.substring(14 , sen.length()) ;
        // System.out.println(nameSen);

//  String to Integer
   String str = "123";
   int numer = Integer.parseInt(str); // it will convert string to number.
   System.out.println(numer);

//    Integer to string
   int n1 = 123;
   String str2 = Integer.toString(n1); // it will convert number to string
   System.out.println(str2);

    }
 }