package Recursion.Recursion_01;

public class SumofNnaturalnum {
 public static void SumofNnaturalNum(int n,int sum  ) {

     if(n==0) {
     System.out.println(sum);
    return;
    }
     sum = sum + n;
     SumofNnaturalNum(n-1, sum);
 }  
 public static void sum(int k,int u,int sum){
  if(k==u) {
    System.out.println(sum);
    return;
  }
    sum = sum + k;
    sum(k+1,u,sum);

 }
 public static int returnsum(int n , int sum){
  if(n==0) return sum;
    sum = sum + n;
   return returnsum(n-1, sum);

}
 public static void main(String[] args) {
    SumofNnaturalNum(5, 0);
    sum(1,6,0);
    System.out.println("returning the sum : "+returnsum(3, 0));
 } 
}
