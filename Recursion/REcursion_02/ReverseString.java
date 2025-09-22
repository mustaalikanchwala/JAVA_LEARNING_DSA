package Recursion.REcursion_02;
public class ReverseString{
    public static void reverseString(String n,int m,String k){
        
        if(m==0){
            k+=n.charAt(m);
            System.out.println(k);
            return ;
        }
        k+=n.charAt(m);
        reverseString(n, m-1, k);
    }


    public static void revString(int x , String f){
          if(x<0) return;
        System.out.print(f.charAt(x));
        revString(x-1, f);
    }
    public static void main(String[] args) {
        String u = "abcdfnci;urcu 4r chh 4c;ht5t iu; tciu ;c3 wh ctu4;4 y8ytcn p4ccn'rcrnru92   2nrrb8r8yn8c81";
        int j = u.length()-1;
        reverseString(u,j , "");
        revString(j, u);
    }
}