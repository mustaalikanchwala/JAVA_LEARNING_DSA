package Functions;
import java.util.*;
public class CheckEligibleForVote {
    public static void eligibility(int n){
        if(n>18){
            System.out.println("you can Vote!YAY..");
        }else{System.out.println("you cannot vote");}
    }
    public static void main(String abs[]){
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibility(age);
    }
}
