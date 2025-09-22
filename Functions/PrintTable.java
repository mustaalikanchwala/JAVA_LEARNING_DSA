package Functions;
import java.util.*;


public class PrintTable {
    public static void Table(int n){
        for(int i=1;i<11;i++){
            System.out.println(n+"X"+i+"="+n*i);
        }
    }
    public static void main(String abs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Table(n);

        
    }
}
