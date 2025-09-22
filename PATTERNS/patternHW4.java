package PATTERNS;
import java.util.*;
public class patternHW4 {
    public static void main(String abs[]){
        int n = 5;
        
        for(int i  = 1; i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
