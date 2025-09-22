// To search element in 2D array

import java.util.*;
public class PS_Q1 {
    public static void main(String abs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter no.of colomuns : ");
        int colm = sc.nextInt();
        int matrix[][] = new int [row][colm];
        System.out.println("Enter Matrix elements : ");
        for(int i = 0;i<row;i++){
            for(int j = 0; j<colm; j++){
                matrix[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Enter no. to search : ");
        int x = sc.nextInt();
        for(int i = 0;i<row;i++){
            for(int j = 0; j<colm; j++){
                if(x==matrix[i][j]){
                    System.out.println("Indices : "+i+","+j);
                    return;
                }
            }
        }
        System.out.println("Enter a Valid number ");
    }
}
