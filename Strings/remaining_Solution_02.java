public class remaining_Solution_02 {

    public static int romanToInt(String s) {
        int val = 0;
        int k = s.length();
        if (s.charAt(s.length() - 2) == 'I' && s.charAt(s.length() - 1) != 'I') {
            val = checkchar(s.charAt(s.length() - 1)) - checkchar(s.charAt(s.length() - 2));
            System.out.println(val);
         k=s.length()-2;
         System.out.println(k);
        }
        for (int i = (k-1); i >=0 ; i--) {

            val = val + checkchar(s.charAt(i));
        }
        return val;
    }

    public static int checkchar(char a) {
        if (a == 'I')
            return 1;
        else if (a == 'V')
            return 5;
        else if (a == 'X')
            return 10;
        else if (a == 'L')
            return 50;
        else if (a == 'C')
            return 100;
        else if (a == 'D')
            return 500;
        else if (a == 'M')
            return 1000;
        else
            return 0;

    }

public static void main(String a[]){
    romanToInt("MCMXCIV");
}
}
