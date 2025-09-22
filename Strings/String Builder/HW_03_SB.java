import java.util.*;
public class HW_03_SB {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int i;
        StringBuilder sb = new StringBuilder(input);
         StringBuilder usernme;
        int k = sb.length();
        for(i=0;i<sb.length();i++){
            if(sb.charAt(i)=='@'){
                usernme = new StringBuilder(sb.delete(i, k));
                System.out.println("Username: "+usernme);
            }
        }
        
    }
}
