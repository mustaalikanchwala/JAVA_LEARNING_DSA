package ArrayList;
import java.util.*;
public class removeEven {
    public static void main(String  s[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("ENter the size of array list");
   int size  = sc.nextInt();
   ArrayList<Integer> list = new ArrayList<>();
   for(int i = 0; i<size;i++){
    int n = sc.nextInt();
    list.add(i,n);
   }
   System.out.println(list);

   for(int j = size-1;j>=0;j--){ //  in such case you have option to remove elements from both end then prefer to remove from end.
    // by removing from front or at any index it shift elemnts which is expensive
    if(list.get(j)%2==0){
        list.remove(j);
    }
   }
   System.out.println(list);
    }
}
