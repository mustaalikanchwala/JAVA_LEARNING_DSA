package Recursion.Recursion_01;

import java.util.Arrays;

public class ReverseArray{
    public static String reversedarr(int arr[],int i , int j){

            // if(i >= j) return Arrays.toString(arr);
            if(i >=(arr.length/2)) return Arrays.toString(arr);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return reversedarr(arr, i+1, j-1);

    }
    public static String reveserarr2(int [] arr, int i ){

        //  if(i >= j) return Arrays.toString(arr);
        if(i >=(arr.length/2)){ return Arrays.toString(arr);}
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;
        System.out.println(arr[i]+" "+ arr[arr.length-i-1]);
        return reveserarr2(arr, i+1);

    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        // dont call both simultaneisly
        System.out.println(reversedarr(arr, 0, arr.length-1));
        System.out.println(reveserarr2(arr, 0));
    }
}