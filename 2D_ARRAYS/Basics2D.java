import java.util.*;

public class Basics2D {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no. of colomuns : ");
        int colm = sc.nextInt();
        int matrix[][] = new int[row][colm];
        // Inputs
        // Rows
        for (int i = 0; i < row; i++) {
            // Colomuns
            for (int j = 0; j < colm; j++) {
                // System.out.print("Enter elemnt for "+i+","+j+" :");
                // matrix[i][j] = sc.nextInt();
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        // outputs
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                // System.out.println("The elemnts at "+i+","+j+" is : "+matrix[i][j]);
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }

        // for Each Loop || Enhanced For Loop 
        // It only works with array and array type of data.
        System.out.println("enhanced printing");
        for (int k[] : matrix) { // here k is represnting single array from matrix
            for (int b : k) { // here b represnt elements of singel array
                System.out.print(b + " ");
            }
            System.out.println();
        }

      


    }
}
