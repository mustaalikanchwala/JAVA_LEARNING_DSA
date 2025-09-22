/*
Dry Run Table for Insertion Sort (Example Array: [5, 3, 8, 4, 2])

Iteration (i) | unSorted | Shifts                                                                 | Array After Insertion
---------------|----------|------------------------------------------------------------------------|-----------------------
1             | 3        | Compare 3 with 5 (3 < 5, so shift 5 to index 1; sort becomes -1)       | [3, 5, 8, 4, 2]
2             | 8        | Compare 8 with 5 (8 > 5, no shift)                                     | [3, 5, 8, 4, 2]
3             | 4        | Compare 4 with 8 (4 < 8, shift 8 to index 3); then 4 with 5 (4 < 5, shift 5 to index 2); then 4 with 3 (4 > 3, no more shifts) | [3, 4, 5, 8, 2]
4             | 2        | Compare 2 with 8 (2 < 8, shift 8 to index 4); then 2 with 5 (2 < 5, shift 5 to index 3); then 2 with 4 (2 < 4, shift 4 to index 2); then 2 with 3 (2 < 3, shift 3 to index 1); sort becomes -1 | [2, 3, 4, 5, 8]

Final Sorted Array: [2, 3, 4, 5, 8]
*/
           



package Sorting;


import java.util.*;
public class InsertionSort{
  public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr [] = new int[size];
        System.out.println("Enter array to insertion sort");
        for(int i = 0;i<size;i++){
         arr[i]=sc.nextInt();
        }
        //  ASC
     for(int i = 1;i<arr.length;i++){
        int unSorted = arr[i];
        int sort = i-1;
        while (sort>=0 && unSorted<arr[sort]) {
            arr[sort+1]=arr[sort];
            sort--; // if sort is 0 then this decrement will lead to sort=-1;
        }
        // Placement
        arr[sort+1]=unSorted; // if sort will -1 then it will store at 0;
     }
     System.out.println("ASC: "+Arrays.toString(arr));
     
     //    DESC 
     for(int i = 1;i<arr.length;i++){
         int UnSorted = arr[i];
         int Sort = i-1;
         while(Sort>=0 && UnSorted>arr[Sort] ){
             arr[Sort+1]=arr[Sort];
             Sort--;
            }
            //    Placement
            arr[Sort+1]=UnSorted;
        }
        System.out.println("DSCE: "+Arrays.toString(arr));


    }
}