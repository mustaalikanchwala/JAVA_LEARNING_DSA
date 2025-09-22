package string;
import java.util.*;
public class removeVowels{
    public static void main(String s []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence to remove Vowles");
        String sen = sc.nextLine();
        String result = "";
        for(int i = 0;i<sen.length();i++){
            if(sen.charAt(i)=='a' || sen.charAt(i)=='e' || sen.charAt(i)=='i'| sen.charAt(i)=='o' || 
            sen.charAt(i)=='u' || sen.charAt(i)=='A' || sen.charAt(i)=='E' || sen.charAt(i)=='I' || sen.charAt(i)=='O'
            || sen.charAt(i)=='U'){
            continue;
          }
          result += sen.charAt(i);
        }
        System.out.println(result);
    }
}