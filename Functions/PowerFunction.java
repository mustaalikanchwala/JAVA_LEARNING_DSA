package Functions;
import java.util.*;
public class PowerFunction {
    public static void CalcPow(int n,int m){
        double result = 1;
        if(m>0){
        for(int i = 1;i<=m;i++){
            
            result*=n;
        }
        System.out.println(result);
    }else if(m<0){
        for(int i = 1; i<=-m;i++){
            result*=(1.0/n);
        }
        System.out.println(result);
    }else {
        System.out.println(result);
    }
    }
    public static void main(String abs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        CalcPow(n,m);
    }
}
