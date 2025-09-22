package Recursion.REcursion_02;
public class Fst_Last_Occurance_Char {
    public static int first = -1;
    public static int last = -1;
    public static void Occurance(String s ,int indx , char element){
        if(indx==s.length()){
            System.out.println("First Occurance "+first);
            System.out.println("last Occurance "+last);
            return;
        }

        char currentchar = s.charAt(indx);
        if(currentchar==element){
            if(first == -1){
                first = indx;
            }else{
                last = indx;
            }
        }
        Occurance(s, indx+1, element);
    }
    public static void main(String[] args) {
        String j = "bsadsfeuijdssak";
        Occurance(j,0 , 'a');
    }
}
