
public class T_Pattern15 {
    public static void main(String[] args) {
        for(int i = 1; i<6;i++){
            for(char j = 'A' ; j<='A'+6-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
