import java.util.*;

public class HW_02_SB {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i)=='e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.println(sb);
    }
}
