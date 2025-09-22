package Functions;
import java.util.*;
public class CalcSumOfOddNum{
    public static int SumOfOdd(int a){
        int sum = 0;
        for(int i = 1;i<=a;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    };
    public static void main(String abs[]){
        System.out.print("Enter a number to calc sum of odd num till there : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumOfOdd(n));

    }
}