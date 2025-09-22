package ARRAYS;
import java.util.*;
public class HW_Q3 {
    public static void main(String a[]){
        System.out.println("Enter the size of Array");
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int array[]=new int[n];
        System.out.println("ENTER ELEMNTS");
        for(int i = 0;i<n;i++){
            array[i]=sc.nextInt();
        }
        boolean IsAscending = true;
        boolean IsDescending = true;
        for(int i = 0;i<n-1;i++){
            if(array[i]>array[i+1]){
             IsAscending = false;
            } 
            if(array[i]<array[i+1]){
                IsDescending = false;
            }
        }
        if(IsAscending){
            System.out.println("Ascending order");
        }else if(IsDescending){
             System.out.println("Descending order");
        }
        else{System.out.println("Unsorted");}
    }
}
