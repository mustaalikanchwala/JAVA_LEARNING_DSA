public class MoveAll_X {
    public static void MoveX(String s, int i, String newS, int count) {
        if (i == s.length()) {
            for (int j = 0; j < count; j++) {
                newS += 'x';
            }
            System.out.println(newS);
            System.out.println("No. Of X ARe : "+count);
            return;
        }

        char curr = s.charAt(i);

        if (curr != 'x') {
            newS += curr;
         
        } else {
            count++;
        }
        MoveX(s, i+1, newS, count);
    }
    
    public static void main(String s[]){
        String a = "abcdxxx";
MoveX(a, 0, "", 0);
    }
}