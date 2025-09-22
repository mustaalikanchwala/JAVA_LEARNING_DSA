

public class KeyPadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void PrintCombo(String keypadnumber,int keypadindx,String combi){
        if(keypadindx == keypadnumber.length()){
            System.out.println(combi);
            return;
        }
        char cuurchar = keypadnumber.charAt(keypadindx);
        String EachKeypadString = keypad[cuurchar-'0'];
        for(int i = 0 ; i<EachKeypadString.length();i++){
            PrintCombo(keypadnumber, keypadindx+1, combi+EachKeypadString.charAt(i));
        }
    }
    public static void main(String[] args) {
        PrintCombo("22", 0, "");
    }
}
