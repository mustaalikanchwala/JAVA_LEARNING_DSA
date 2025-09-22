package string;
import java.util.*;
public class reverseVowelsOfString{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j){
            while(ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u' && ch[i]!='A' && ch[i]!='E' && ch[i]!='I' && ch[i]!='O' && ch[i]!='U'){
                i++;
            }
            while(ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u' && ch[j]!='A' && ch[j]!='E' && ch[j]!='I' && ch[j]!='O' && ch[j]!='U'){
                j--;
            }
            if(i>=j) break;
        char temp = ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
   i++;
   j--;
        }
    str = String.valueOf(ch);
    System.out.println(str);
      }
    }
