package Recursion.Recursion_01;

import java.util.*;

public class Basics {
    public static void printNum(int n){
        if(n==0) return;
        System.out.println(n);
        printNum(n-1);
    }
    public static void printNUM(int n,int m){
        if(m>n) return;
        System.out.println(m);
        printNUM(n,m+1);
    }
    public static void main(String[] s){
        printNum(5);
        printNUM(5,0);
    }
}
