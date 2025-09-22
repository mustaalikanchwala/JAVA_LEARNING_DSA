public class Solution_01 {
    public static void main(String a[]){
      StringBuilder sb = new StringBuilder("abcabcbb");
         if(sb.length()==0 || sb.length()==1){
                    System.out.println(sb.length());
                }
        for(int i = 0; i<sb.length();i++){
            for(int j = i+1;j<sb.length();j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    System.out.println(sb.length());
                    System.out.println(sb);
                    System.out.println(sb.charAt(j));
                    sb.delete(j,j+1);
                    System.out.println(sb.charAt(j));
                    System.out.println(sb.length());
                    System.out.println(sb);
                    j--;
                }
            }
        }
        System.out.println(sb.length());
}
}
