import java.util.*;

public class Transpose {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter colomuns ");
        int m = sc.nextInt();
        int arr1[][] = new int[n][m];
        // int arr2[][] = new int[n][m];
        System.out.println("ENter arr elemnts");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // here row becomes colomun and colomun become row and first printing colomoun
        // which is j and then i
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) { // here j is indicating coloumn indices and i indicating row
                System.out.print(arr1[j][i] + " ");
            }
            System.out.println();
        }

        // Alternate Method

        // for(int i = 0;i<n;i++){
        // for(int j = 0;j<m;j++){
        // arr2[j][i]=arr1[i][j];
        // }
        // }
        // System.out.println("Transpose of array is : ");
        // for(int i = 0;i<n;i++){
        // for(int j = 0;j<m;j++){
        // System.out.print(arr2[i][j]+" ");
        // }
        // System.out.println();
        // }

        //  Alternate Method 
        
//     if(row==col){
//  for(int i = 1; i <OGarr.length;i++){
//     for(int j = 0;j<i;j++){
//         int temp = OGarr[i][j];
//         OGarr[i][j]=OGarr[j][i];
//         OGarr[j][i]=temp;
//     }
//  }
//     }
//     for(int i = 0; i <OGarr.length;i++){
//     for(int j = 0;j<OGarr[0].length;j++){
//         System.out.print(OGarr[i][j]+" ");
//     }
// System.out.println();}
    }
}
