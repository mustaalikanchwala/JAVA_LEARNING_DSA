import java.util.Scanner;

public class Rot_90_DEG {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter colomuns ");
        int m = sc.nextInt();
        int arr1[][] = new int[n][m];
        System.out.println("ENter arr elemnts");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        if (n == m) {
         for(int i = 1; i <arr1.length;i++){
            for(int j = 0; j< i ;j++){
                int temp = arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
         }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i<arr1.length;i++){
            int k = arr1.length-1;
            for(int j = 0;j<(m/2);j++){
                int temp = arr1[i][j];
                arr1[i][j]=arr1[i][k];
                arr1[i][k]=temp;
                k--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}