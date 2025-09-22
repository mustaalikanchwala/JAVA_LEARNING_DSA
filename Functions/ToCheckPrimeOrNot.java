package Functions;
import java.util.*;
public class ToCheckPrimeOrNot {
//     public static boolean PrimeOrNot(int  n){
//         if(n<=1){
//             return false;
//         }
//         for(int i = 2;i<=n/2;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
// }
// Using Math.sqrt
 public static boolean PrimeOrNot(int  n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
}
public static void main(String abs[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 System.out.println( PrimeOrNot(n));
}
    
}
