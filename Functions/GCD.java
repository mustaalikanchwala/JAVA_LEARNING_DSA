package Functions;
import java.util.*;

public class GCD {
  public static  int gcd(int a,int b){
    while(a!=b){
    if(a>b){
      a=a-b;
    }else{
      b=b-a;
    }
    }
    return b;
  }
    public static void main(String abs[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(gcd(a,b));

    }
}
