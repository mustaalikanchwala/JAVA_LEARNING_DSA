import java.util.*;
public class HW_03 {
    public static void main(String[] s){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number to check how mush 1s are there in");
        int n = sc.nextInt();
        // int bitmask;
        int count=0;
        // for(int i = 0;i<32;i++){
        //     bitmask=1<<i;
        //     if((bitmask & n)!=0) count++;
        // }
//   more efficient method
while(n>0){
    if((n&1)==1) count++;
    n=n>>1;
}

        System.out.println("Number os 1s  is : "+count);
    }
}
