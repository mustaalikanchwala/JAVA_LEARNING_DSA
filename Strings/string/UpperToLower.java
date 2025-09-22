package string;
import java.util.*;
public class UpperToLower {
    public static void main(String s[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        char[] ogstr = str.toCharArray();
        for(int i = 0 ; i<ogstr.length;i++){
            char ch =ogstr[i];
            if(ch>='A' && ch<='Z'){
                // int c  = ch-'A'+'a';
                char lowechar = (char) (ch-'A'+'a'); //shortcut
                ogstr[i]=lowechar;

            }
        }
        str = String.valueOf(ogstr);
        System.out.println(str);
    }
}
