
public class T_Pattern16 {
    public static void main(String[] args) {
        char ch = 'A';
        for(int i = 0 ; i<6;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }    
}
