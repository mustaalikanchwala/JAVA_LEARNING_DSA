package ARRAYS;
// Reverse Array

import java.util.*;
public class Solution_08 {

    public static String reverseArray(int a []){
    int n = a.length;
    int j = a.length-1;
    for(int i = 0 ; i<n/2;i++){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        j--;
    }
    return Arrays.toString(a);

    } 
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(reverseArray(a));
    }
}
