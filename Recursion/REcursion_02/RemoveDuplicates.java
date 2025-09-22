package Recursion.REcursion_02;
public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
  public static void removeDupli(String s , int i , String News){
    if(i==s.length()){
        System.out.println(News);
        return;
    }
      
    char c = s.charAt(i);
    if(map[c-'a']==true){
        removeDupli(s, i+1,News);
    }else{
        News+=c;
        map[c-'a']= true;
        removeDupli(s, i+1, News);
    }
    }
  
  public static void main(String[] args) {
    removeDupli("abacdcdb", 0,"");
  }
}
