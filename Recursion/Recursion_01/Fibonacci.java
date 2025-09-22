package Recursion.Recursion_01;
public class Fibonacci {
    public static void Fibonacci(int n ,int m ,int a,int b){
if(m==n){
    System.out.print(b+" ");
    return;
}
      if(m==1) {
System.out.print(a+" ");
 Fibonacci(n, m+1, a, b); 
    }else if(m>=2){
System.out.print(b+" ");
    int temp = a+b;
    a= b;
    b=temp;
    Fibonacci(n, m+1, a, b); 
    }
    }
    public static void main(String[] s){
        int n = 7;
        int a = 0;
        int b = 1;
       Fibonacci(n, 1, a, b);
    }
}
