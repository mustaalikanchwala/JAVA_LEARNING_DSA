package Recursion.REcursion_02;


public class SortingFromRecursion{
    public static boolean Sorting(int arr[], int i ){
    //     if(i==0) {
    //    return true ;
    //     } 
    //     if(arr[i]<arr[i-1]){
    //         return Sorting(arr,i-1);
    //     }else{
    //         return false;
    //     }   
    if (i==0) return true;
    if(arr[i]<=arr[i-1]){
     return false;
    }     
    return Sorting(arr, i-1);
    }
    public static void main(String s[]){
        int arr[] = {2,3,4};
        if (Sorting(arr, arr.length-1)) {
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }
    }
}