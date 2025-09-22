package Functions;
import java.util.*;

public class GreatestOfTwoNum {
    public static void greatestoftwonum(int a,int b){
        if(a>b){
            System.out.println(a+" " + "is greatest");
        }else{ System.out.println(b +" "+ "is greastest");}
    }
    public static void main(String abs[]){
        System.out.println("Enter two value to check greatest");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        greatestoftwonum(n, m);
    }
}
